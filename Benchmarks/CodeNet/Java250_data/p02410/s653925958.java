import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] A = new int[n1][n2];
        int[] B = new int[n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
             A[i][j]= sc.nextInt();
            }
        }
        for(int k=0;k<n2;k++){
            B[k] = sc.nextInt();
        }
        	for(int i=0;i<n1;i++){
                int sum =0;
                for(int j=0;j<n2;j++){
                    sum += A[i][j] * B[j];
                }
                System.out.println(sum);
            }
    }
}
