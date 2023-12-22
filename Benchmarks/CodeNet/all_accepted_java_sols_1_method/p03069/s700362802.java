
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int min = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '.'){
                min++;
            }
        }
        int num = min;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '#'){
                num++;
            } else {
                num--;
            }
            min = Math.min(num,min);
        }
        System.out.println(min);
    }
}
