import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String str;
        int[] num;
        
        try {
            while(reader.ready()){
                str = reader.readLine();
                num = getNum(str);
                System.out.println(plusInterest(100000, num[0]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int plusInterest(int money, int week){
        if (week == 0) {return money;}
        money += money * 0.05;
        money = (money % 1000 == 0) ? money : (int) Math.round((money + 500) / 1000.0) * 1000;
        return plusInterest(money, week-1);
    }

    private static int[] getNum(String str){
        String[] data = str.split(" "); 
        int[] num = new int[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        return num;
    }

}
