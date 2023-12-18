import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] time = new int[cnt], point = new int[cnt];
        String ans = "Yes";
        for(int i = 0; i < cnt; i++){
            time[i] = sc.nextInt();
            point[i] = sc.nextInt() + sc.nextInt();
            if(time[i] < point[i]){
                ans = "No";
            }
            if((time[i] % 2) != (point[i] % 2)){
                ans = "No";
            }
        }
        System.out.println(ans);

    }
}
