import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        List<Integer> apples = new ArrayList<>();
        for(int i = 0;i < n;i++){
            apples.add(l + i);
        }
        int min = Integer.MAX_VALUE;
        for(int apple : apples){
            if(apple < 0){
                apple *= -1;
            }
            if(min > apple){
                min = apple;
            }
        }
        for(int i = 0;i < apples.size();i++) {
            int apple = apples.get(i);
            if (apple < 0) {
                apple *= -1;
            }
            if (apple == min) {
                apples.remove(i);
                break;
            }
        }
        int r = 0;
        for(int apple : apples){
            r += apple;
        }
        System.out.println(r);
    }
}