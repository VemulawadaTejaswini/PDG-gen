import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] k = new int[n-1];

        for(int i = 1 ; i <= n ; i++){
            for(int j = i+1 ; j <= n ; j++){
                k[Math.min(j-i, Math.abs(i-x)+1+Math.abs(j-y))-1]++;
            }
        }

        StringBuilder strb = new StringBuilder();
        for(int num : k){
            strb.append(""+num+"\n");
        }
        System.out.println(strb.toString());
    }
}
