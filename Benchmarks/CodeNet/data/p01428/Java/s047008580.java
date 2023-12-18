import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int[] dx = {0,0,1,-1,1,1,-1,-1};
        int[] dy = {1,-1,0,0,1,-1,1,-1};

        char[][] game = new char[8][8];
        for(int i=0; i<8; i++){
            String line = sc.next();
            game[i] = line.toCharArray();
        }

        int turn = 0;
        int conti = 0;
        while(true){
            int max = 0;
            int x = -1, y = -1;
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++){
                    if(game[i][j]!='.') continue;
                    int cnt = 0;
                    for(int k=0; k<8; k++){
                        int nn = 1;
                        while(true){
                            int nx = j + dx[k]*nn, ny = i + dy[k]*nn;
                            int nxx = j + dx[k]*(nn+1), nyy = i + dy[k]*(nn+1);
                            if(nx<0 || nx>=8 || ny<0 || ny>=8 ||
                               nxx<0 || nxx>=8 || nyy<0 || nyy>=8) break;
                            if(turn==0){
                                if(game[ny][nx]!='x') break;
                                if(game[ny][nx]=='x' && game[nyy][nxx]=='o'){
                                    cnt += nn;
                                    break;
                                }
                            }
                            if(turn==1){
                                if(game[ny][nx]!='o') break;
                                if(game[ny][nx]=='o' && game[nyy][nxx]=='x'){
                                    cnt += nn;
                                    break;
                                }
                            }
                            nn++;
                        }
                    }
                    if(turn==0 && cnt>max){
                        max = cnt;
                        x = j; y = i;
                    }
                    if(cnt!=0 && turn==1 && cnt>=max){
                        max = cnt;
                        x = j; y = i;
                    }
                }
            }

            if(x==-1){
                if(conti==1) break;
                conti = 1;
                turn = 1 - turn;
                continue;
            }
            conti = 0;

            if(turn==0) game[y][x] = 'o';
            else game[y][x] = 'x';

            for(int i=0; i<8; i++){
                boolean boo = false;
                int nn = 1;
                while(true){
                    int nx = x + dx[i]*nn, ny = y + dy[i]*nn;
                    int nxx = x + dx[i]*(nn+1), nyy = y + dy[i]*(nn+1);
                    if(nx<0 || nx>=8 || ny<0 || ny>=8 ||
                       nxx<0 || nxx>=8 || nyy<0 || nyy>=8) break;
                    if(turn==0){
                        if(game[ny][nx]!='x') break;
                        if(game[ny][nx]=='x' && game[nyy][nxx]=='o'){
                            boo = true;
                            break;
                        }
                    }
                    if(turn==1){
                        if(game[ny][nx]!='o') break;
                        if(game[ny][nx]=='o' && game[nyy][nxx]=='x'){
                            boo = true;
                            break;
                        }
                    }
                    nn++;
                }

                nn = 1;
                if(boo){
                    while(true){
                        int nx = x + dx[i]*nn, ny = y + dy[i]*nn;
                        if(nx<0 || nx>=8 || ny<0 || ny>=8) break;
                        if(turn==0){
                            if(game[ny][nx]=='x') game[ny][nx] = 'o';
                            else break;
                        }
                        if(turn==1){
                            if(game[ny][nx]=='o') game[ny][nx] = 'x';
                            else break;
                        }
                        nn++;
                    }
                }
            }
            turn = 1 - turn;
        }

        for(int i=0; i<8; i++){
            System.out.println(String.valueOf(game[i]));
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}