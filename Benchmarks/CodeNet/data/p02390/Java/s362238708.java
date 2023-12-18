import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        
        int hh = (int)(num / 3600); num -= hh * 3600;
        int mm = (int)(num / 60); num -= mm * 60;
        int ss = num;
        
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
