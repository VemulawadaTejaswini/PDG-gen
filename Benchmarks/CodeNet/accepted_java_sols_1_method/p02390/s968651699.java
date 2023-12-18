import java.io.*;

public class Main {
   public static void main (String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
        int second = Integer.parseInt(reader.readLine());
        int hour = 0,minute = 0;
        while(second >= 3600) {
            second = second - 3600;
            hour++;
        }
        while(second >= 60) {
            second = second - 60;
            minute++;
        }
        System.out.println(hour + ":" + minute + ":" + second);
    } catch(IOException e) {}
   } 
}
