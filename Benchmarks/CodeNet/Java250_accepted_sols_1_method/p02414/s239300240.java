import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        
        int [][] a=new int[n][m];
        int [][] b=new int[m][l];
        long[][] x=new long[n][l];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<l;k++){
                    x[i][k]+=a[i][j]*b[j][k];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j!=l-1){
                	System.out.print(x[i][j]+" ");
            	}else{
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

