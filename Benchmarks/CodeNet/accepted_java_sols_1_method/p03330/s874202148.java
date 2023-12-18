import java.util.*;



public class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int[][]D=new int[C][C];
        int[][]c=new int[N][N];
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                D[i][j]=sc.nextInt();
            }
        }
        int[][]kazu=new int[3][50];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                c[i][j]=sc.nextInt()-1;
                kazu[(i+j)%3][c[i][j]]++;

            }
        }
        
        int ans=1000000000;
        int sum[][]=new int[3][C];
        for(int i=0;i<3;i++){
            for(int j=0;j<C;j++){
                for(int k=0;k<C;k++){
                    sum[i][j]+=D[k][j]*kazu[i][k];
                }
            }
        }
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                for(int k=0;k<C;k++){
                    if((i==j)||(j==k)||(i==k)){
                        continue;
                    }
                    ans=Math.min(ans,sum[0][i]+sum[1][j]+sum[2][k]);
                }
            }
        }
        System.out.println(ans);
        

        
        

            

        
        
        
        
            

        
        

    }
    }
