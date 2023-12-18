import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int m = sc.nextInt();
            boolean check = false;
            for(int j=0;j<n;j++) {
                check = recursive(A, m, 0, j,n,check);
            }
            if(check) System.out.println("yes");
            else System.out.println("no");
        }
    }
    public static boolean recursive(int A[],int m,int sum,int num,int n,boolean check){
        for(int i=num;i<n;i++){
            if(check) break;
            if (A[i]+sum==m) {
                check =true;
                break;
            }
            else if(A[num]+sum<m){
                int sum2=sum+A[num];
                check = recursive(A,m,sum2,i+1,n,check);
            }
            else break;
        }
        return check;
    }
}
