import java.util.*;
public class Main{
    public static void main(String[] aargs){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Integer B[] = A.clone();
        Arrays.sort(A,Collections.reverseOrder());
        for(int i=0;i<N;i++){
            if(B[i]!=A[0]){
                System.out.println(A[0]);
            }
            else{
                System.out.println(A[1]);
            }
        }
    }
}