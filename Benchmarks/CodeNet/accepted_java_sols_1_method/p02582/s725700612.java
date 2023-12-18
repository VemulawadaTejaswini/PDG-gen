
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String weather = s.nextLine();
        int count = 0, max =0;
        for(int i = 0; i < 3; ++i) {
            if(weather.charAt(i) == 'R') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
   }
}
