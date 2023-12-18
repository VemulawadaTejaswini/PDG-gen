import java.util.*;

class Main{

    int h, w, n;
    char[][] board;
    String[] s;
    boolean change;

    void solve(){
        Scanner sc = new Scanner (System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        s = new String[h];
        board = new char[h][w];
        for(int i=0; i<h; i++) s[i] = sc.next();

        boolean cake = true;
        for(int i=0; i<h; i++){
            for(int j=0; j<w-1; j++){
                board = new char[h][w];
                for(int l=0; l<h; l++) board[l] = s[l].toCharArray();
                             
                char tmp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = tmp;
        
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
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(board[i][j]!='.'){
                    bfs(i, j); 
                    delete();
                }
            }
        }

        if(change){
            change = false;
            cake();
        }
    }

    //1 : same , 2 : delete
    void delete(){
        int st = 0, go = 0;
        for(int k=0; k<h; k++){
            while(st<w && board[k][st]!='1') st++;
            if(st==w) break;
            go = st;
            while(go+1<w && board[k][go+1]=='1') go++;
            if(go-st>=n){
                change = true;
                for(int l=st; l<=go; l++) board[k][l] = '2';
            }
        }
        
        st = 0; go = 0;
        for(int k=0; k<w; k++){
            while(st<h && !(board[st][k]=='1' || board[st][k]=='2')) st++;
            if(st==h) break;
            go = st;
            while(go+1<h && (board[go+1][k]=='1' || board[go+1][k]=='2')) go++;
            if(go-st>=n){
                change = true;
                for(int l=st; l<=go; l++) board[l][k] = '2';
            }
        }
        
        LinkedList<Character> list = new LinkedList<Character>();
        for(int k=0; k<w; k++){
            for(int l=h-1; l>=0; l--){
                if(board[l][k]=='2' || board[l][k]=='.') list.add('.');
                else if(board[l][k]=='1'){
                    board[l][k] = s[l].charAt(k);
                    list.addFirst(board[l][k]);
                }else list.addFirst(board[l][k]);
            }
            for(int l=0; l<h; l++) board[l][k] = list.pollFirst();
        }
    }
    
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    void bfs(int y, int x){
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{y, x});
        boolean[][] v = new boolean[h][w];
        v[y][x] = true;

        while(q.size()>0){
            int[] pp = q.poll();
            int yy = pp[0], xx = pp[1];

            for(int i=0; i<4; i++){
                int ny = yy + dy[i], nx = xx + dx[i];
                if(ny<0 || ny>=h || nx<0 || nx>=w) continue;

                if(board[ny][nx]==board[y][x] && !v[ny][nx]){
                    board[ny][nx] = '1';
                    v[ny][nx] = true;
                    q.add(new int[]{ny, nx});
                }
            }
        }
        board[y][x] = '1';
    }

    public static void main(String[] args){
        new Main().solve();
    }
}