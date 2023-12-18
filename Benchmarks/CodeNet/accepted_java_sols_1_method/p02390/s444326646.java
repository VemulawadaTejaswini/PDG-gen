import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input_sec = scan.nextInt();
        int output_sec = input_sec % 60;
        int output_minute = input_sec / 60;
        int output_hour = 0;
        if (output_minute != 0 && output_minute >= 60){
            output_hour = output_minute / 60;
            output_minute %= 60;
        }
        System.out.println(output_hour + ":" + output_minute + ":" + output_sec);
    }
}
