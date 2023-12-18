import java.util.*;
public class Main{
    public static int M=12;
      public static int N=12;
    public static void main(String[] a)throws java.io.IOException{
 
    Scanner scan=new Scanner(System.in);
    while(scan.hasNext()){
                    int ans =0;
                    int [][] field =new int[M][N];
                    for(int i=0;i<M;i++){
                     String line = scan.nextLine();
                        for(int j=0;j<N ;j++){
                            field[i][j] = line.charAt(j);
 
                        }
                    }
 
 
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            if(field[i][j] != '0'){
                                ++ans;
                                dfs(i,j,field);
 
                            }
                        }
                    }
                    System.out.println(ans);
                    scan.nextLine();
 
            }
    }
 
 
          public static void dfs(int y,int x,int [][] field){
              int crop = field[y][x];
              field[y][x] = '0';
              int [] dx = {1,0,-1,0};
              int [] dy ={0,1,0,-1};
              for(int i=0;i<4;i++){
                  int nx =x+dx[i];
                  int ny =y+dy[i];
                  if(0<=nx && nx< N &&0<=ny && ny <M  &&( field[ny][nx]==crop))
                      dfs(ny,nx,field);
              }
              return;
          }
}