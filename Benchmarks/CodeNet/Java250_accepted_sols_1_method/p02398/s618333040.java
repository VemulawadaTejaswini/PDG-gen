import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        String[] temp = line.split("\\s");
        br.close();

        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[1]);
        int num3 = Integer.parseInt(temp[2]);
        int count = 0;

        ArrayList<Integer> yakusu = new ArrayList<Integer>();

        for(int i=1;i<=num3;i++){
            if(num3 % i == 0){
                yakusu.add(i);
            }                        
        }

        for(int i=num1;i<=num2;i++){
            int j = yakusu.indexOf(i);
            if(j != -1){
                count++;
            }
        }

        System.out.println(count);
    }
}