import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        int[][] nm=new int[n][m];
        int[][] ml=new int[m][l];
        Long[][] nl=new Long[n][l];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nm[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<m;k++){
            for(int p=0;p<l;p++){
                ml[k][p]=sc.nextInt();
            }
        }for(int a=0;a<n;a++){
            for(int b=0;b<l;b++){
                Long sum=0L;
                for(int c=0;c<m;c++){
                    sum+=nm[a][c]*ml[c][b];
                }
                nl[a][b]=sum;
            }
        }
        for(int d=0;d<n;d++){
            for(int e=0;e<=l-1;e++){
                System.out.print(nl[d][e]);
                if(e!=l-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
