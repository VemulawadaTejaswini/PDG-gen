import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int a[] = new int[N+1];
        for(int i=1;i<=N;i++){
            a[sc.nextInt()]=i;
        }
        for(int i=1;i<=N;i++){
            System.out.print(a[i]+" ");
        }
    }
}
