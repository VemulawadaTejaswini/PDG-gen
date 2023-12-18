import java.util.*;
public class Main{
    public static int M;
    public static int N;
    	public static void main(String[] a)throws java.io.IOException{
    		Scanner scan=new Scanner(System.in);
    		while(true){
    				N=scan.nextInt();
    				M=scan.nextInt();
    				if((N|M)==0)break;
                    int ans =0;
                    int [][] field =new int[M][N];
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N ;j++){
                            field[i][j] = scan.nextInt();
                        }
                    }
 
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            if(field[i][j] == 1){
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
              field[y][x] = 0;
              for(int i=-1;i<=1;i++){
            	  for(int j=-1;j<=1;j++){
                  int nx =x+j;
                  int ny =y+i;
                  if(0<=nx && nx< N &&0<=ny && ny <M &&field[ny][nx]==1)
                      dfs(ny,nx,field);
            	  }
              }
              return;
          }
}