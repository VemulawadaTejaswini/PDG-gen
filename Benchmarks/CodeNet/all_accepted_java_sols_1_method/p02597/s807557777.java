import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int cntr = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){
                cntr++;
            }
        }
        int cnt = 0;
        for(int i= 0 ;i < cntr; i++){
            if(s.charAt(i) == 'R'){
                cnt++;
            }
        }
        System.out.println(cntr - cnt);
    }
}
