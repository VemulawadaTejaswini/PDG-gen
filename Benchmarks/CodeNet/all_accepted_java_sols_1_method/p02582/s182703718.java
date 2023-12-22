import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.next();
        int cnt = 0;
        for ( int i = 0; i < 3; i++){
            String c = str.substring(i,i+1);
            if (c.equals("R")){
                cnt = cnt + 1;
            }
        }
        if ( str.equals("RSR")) {
                cnt = 1;
        }
        System.out.println(cnt);
    }
}
