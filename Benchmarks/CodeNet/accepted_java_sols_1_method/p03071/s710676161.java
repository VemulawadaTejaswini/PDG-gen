import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;



        PrintWriter out = new PrintWriter(System.out);
        try {
            str1 = br.readLine();
            String str2[] = str1.split(" ", 0);

            int intB1 = Integer.parseInt(str2[0]);
            int intB2 = Integer.parseInt(str2[1]);

            int intCoin = 0;
            if (intB1 >= intB2) {
            	intCoin = intCoin + intB1;
            	intB1--;
            }else {
            	intCoin = intCoin + intB2;
            	intB2--;
            }

            if (intB1 >= intB2) {
            	intCoin = intCoin + intB1;
            	intB1--;
            }else {
            	intCoin = intCoin + intB2;
            	intB2--;
            }


            System.out.println(intCoin);


        } catch (IOException e) {

        }


    }
}