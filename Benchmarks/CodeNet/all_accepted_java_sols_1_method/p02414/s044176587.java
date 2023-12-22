import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int l=scanner.nextInt();
        long a[][]=new long[n][m];
        long b[][]=new long[m][l];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                b[i][j]=scanner.nextInt();
            }
        }
        long c[][]=new long[n][l];
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                long result=0;
                for(int k=0;k<m;k++){
                    result+=a[i][k]*b[k][j];
                }
                c[i][j]=result;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                System.out.print(c[i][j]);
                if(j!=l-1){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }
        }

    }

}

