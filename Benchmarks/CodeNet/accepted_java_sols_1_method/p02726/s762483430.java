import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int D [] = new int[N];
        Arrays.fill(D,0);
        for(int i=1;i<N;i++){
            for(int j=i+1;j<=N;j++){
                int num = Math.min(Math.abs(j-i),Math.abs(X-i)+1+Math.abs(Y-j));
                num = Math.min(num,Math.abs(Y-i)+1+Math.abs(X-j));
                D[num]++;
            }
        }
        for(int i=1;i<N;i++) System.out.println(D[i]);
    }
}