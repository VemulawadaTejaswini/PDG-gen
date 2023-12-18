import java.util.Scanner;
class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] B = new int[m];
            for(int i=0;i<m;i++){
                B[i] = sc.nextInt();
            }
            for(int i=0;i<Math.min(n, m);i++) {
            	if(B[i]>A[i]) {
            		System.out.println(1);
            		return;
            	}
            	if(A[i]>B[i]) {
            		System.out.println(0);
            		return;
            	}
            }
            System.out.println(m>n?1:0);
        }
    }
}
