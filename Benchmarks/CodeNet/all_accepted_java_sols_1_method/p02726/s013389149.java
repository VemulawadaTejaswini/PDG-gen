import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] ans = new int[N];

        for(int i=1;i<N;i++){
            for(int j=i+1;j<=N;j++){
                int minDistance = N;
                minDistance = Math.min(minDistance,j-i);
                minDistance = Math.min(minDistance,Math.abs(i-X)+Math.abs(j-Y)+1);
                minDistance = Math.min(minDistance,Math.abs(i-Y)+Math.abs(j-X)+1);
               // System.out.println(minDistance);
                ans[minDistance-1]++;
            }
        }

        for(int i=0;i<N-1;i++){
            System.out.println(ans[i]);
        }

    }

}







