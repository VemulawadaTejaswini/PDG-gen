import java.util.*;

class Main{
    public static void main(String[] args){
        int N = 3;
        int[]a = new int[N];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        System.out.println(a[0] * a[1] / 2);
    }
}