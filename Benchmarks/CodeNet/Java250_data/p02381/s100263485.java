import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            double total = 0;
            double average = 0;
            double a = 0;

            int n = Integer.parseInt(br.readLine());

//          ???????????¶
            if(n == 0){
                break;
            }
            String[] score = br.readLine().split(" ");

//          ?????????????¨????total?????????
            for(int i = 0; i < n; i++){
                total += Double.parseDouble(score[i]);
            }
//          ??????????????????average?????????
            average = total / n;

//          ?¨??????????a?????????
            for(int i = 0; i < n; i++){
               a += Math.pow(Double.parseDouble(score[i]) - average, 2);
            }
            a = Math.sqrt(Math.abs(a / n));

            System.out.println(a);
        }
    }
}