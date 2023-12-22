import java.math.BigInteger;
import java.util.Scanner;
import java.lang.String;



public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n;
        n = cin.nextInt();


       String ss = cin.next();

       char[] aa = new char[n];
       aa = ss.toCharArray();
        int cnt=0;


        for (int i = 0; i <aa.length-2 ; i++) {

            //System.out.println("ok");
            if(aa[i]=='A' && aa[i+1]=='B' && aa[i+2]=='C')
                cnt++;

        }
        System.out.println(cnt+"");

    }
}
