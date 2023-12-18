import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        
        int A[][] = new int[n][m];
        int B[][] = new int[m][l];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                B[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        
        long C[][] = new long[n][l];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j == 0){
                    System.out.print(C[i][j]);
                }else{
                    System.out.print(" "+C[i][j]);
                }
            }
            System.out.println();
        }
        
    }
}
