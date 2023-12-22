import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour = time / 3600;
        int minitue = (time%3600)/60;
        int second = time%60;
        System.out.println(hour+":"+minitue+":"+second);
    }
}