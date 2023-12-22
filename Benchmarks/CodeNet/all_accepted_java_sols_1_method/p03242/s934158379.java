import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        String d;
        String ans = "";

        for(int i = 0; i < 3; i++){

            d = N.substring(i,i+1);

            if( d.equals("9") ){

                d = "1";

            }else if( d.equals("1") ){

                d ="9";

            }

           ans = ans.concat(d);
        }

        System.out.println(ans);
    }
}