import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int first = sc.nextInt();
        a[0] = first;
        int second = sc.nextInt();
        a[1] = second;
        if(first < second){
            int tmp = first;
            first = second;
            second = tmp;
        }
        for(int i = 2; i < N; i++){
            int A = sc.nextInt();
            a[i] = A;
            if(first < A){
                second = first;
                first = A;
            }else if(second < A){
                second = A;
            }
        }
        for(int i = 0; i < N; i++){
            if(a[i] == first){
                System.out.println(second);
            }else{
                System.out.println(first);
            }
        }
    }
}
