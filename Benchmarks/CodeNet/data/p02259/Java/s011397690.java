import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        int count = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int j = N-1; j > 0; j--){
                if(A[j] < A[j-1]) {
                    int tmp;
                    tmp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = tmp;
                    count++;
                    flag = true;
                }
            }
        }
        for(int i = 0;i < A.length-1;i++){
            System.out.printf("%d ",A[i]);
        }
        System.out.println(A[N-1]);
        System.out.println(count);
    }
}
