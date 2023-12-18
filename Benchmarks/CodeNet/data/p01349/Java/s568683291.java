import java.util.*;

class Main{

    int h, w, n;
    char[][] board, board2;
    String[] s;
    boolean change;

    void solve(){
        Scanner sc = new Scanner (System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        s = new String[h];
        for(int i=0; i<h; i++) s[i] = sc.next();

        boolean cake = false;
        for(int i=0; i<h; i++){
            for(int j=0; j<w-1; j++){
                board = new char[h][w];
                board2 = new char[h][w];
                for(int l=0; l<h; l++){
                    board[l] = s[l].toCharArray();
                    board2[l] = s[l].toCharArray();
                }

                if(board[i][j]==board[i][j+1]) continue;
                
                             
                char tmp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = tmp;
                board2[i][j] = board[i][j];
                board2[i][j+1] = board[i][j+1];
        
                down();
                cake();

                cake = true;
                for(int k=0; k<h; k++){
                    for(int l=0; l<w; l++){
                        if(board[k][l]!='.'){
                            cake = false;
                            break;
                        }
                    }
                    if(!cake) break;
                }
                if(cake) break;
            }
            if(cake) break;
        }

        if(cake) System.out.println("YES");
        else System.out.println("NO");
    }

    void cake(){
        change = false;

        delete();

        if(change){
            cake();
        }
    }

    void down(){
        LinkedList<Character> list = new LinkedList<Character>();
        for(int k=0; k<w; k++){
            for(int l=0; l<h; l++){
                if(board[l][k]=='2' || board[l][k]=='.') list.add('.');
                else list.addFirst(board[l][k]);
            }
            for(int l=h-1; l>=0; l--){
                board[l][k] = list.pollFirst();
                board2[l][k] = board[l][k];
            }
        }
    }

    void delete(){

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){

                if(board2[i][j]=='.') continue;
                int idx1 = i, idx2 = j;
                for(int k=i+1; k<h; k++){
                    if(board2[k][j]!=board2[i][j]){
                        break;
                    }
                    idx1 = k;
                }

                if(idx1-i+1>=n){
                    change = true;
                    for(int k=i; k<=idx1; k++) board[k][j] = '2';
                }

                for(int k=j+1; k<w; k++){
                    if(board2[i][k]!=board2[i][j]){
                        break;
                    }
                    idx2 = k;
                }

                if(idx2-j+1>=n){
                    change = true;
                    for(int k=j; k<=idx2; k++) board[i][k] = '2';
                }
            }
        }
        down();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}