import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int A[][] = new int[n][m];
        int b[] = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        
        int c[] = productVector(A,b);
        
        for(int i=0;i<n;i++){
            System.out.println(c[i]);
        }
        
    
    }
    static int[] productVector(int a[][], int b[]){
        int c[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i] += (a[i][j]*b[j]);
            }
        }
        return c;
    }
}
