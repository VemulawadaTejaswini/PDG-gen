


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            int[][] map = new int[10][10];
            
            while((line=br.readLine())!=null){
                if(line.equals(""))break;
                String[] splited = line.split(" ");
                int month = Integer.parseInt(splited[0]);
                int day = Integer.parseInt(splited[1]);
                if(month==0)break;
                int[] days = new int[]{31,29,31,30,   31,30,31,31,    30,31,30,31};
                int passday =0;
                for(int i=0;i<month-1;i++){
                    passday+=days[i];
                }
                passday+=day;
                passday%=7;
                String weekday[] = new String[]{"Wednesday","Thursday",
                    "Friday","Saturday","Sunday","Monday","Tuesday"};
                System.out.println(weekday[passday]);

            }
        }catch(Exception e){e.printStackTrace();}
    }
}