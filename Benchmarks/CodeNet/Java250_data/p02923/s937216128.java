import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] value = new int[elements];
        for (int i = 0; i < elements; i++) {
            value[i] = sc.nextInt();
        }
        solve(value);
    }

    public static void solve(int[] height){
        int result = 0;
        int now = 0;
        for(int i=1; i<height.length; i++){
            if(height[i-1]>=height[i]){
                now++;
            }else{
                if(result<now) result = now;
                now = 0;
            }
        }
        if(result<now) result = now;
        System.out.println(result);
    }
}