import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int flag = 0;
        int cash = 1;
        for(int i = 0 ; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;;i++){
            cash = a[cash - 1];
            flag++;
            if(cash == 2){
                break;
            }else if(flag > N){
                flag = -1;
                break;
            }
        }
        System.out.println(flag);
    }
}