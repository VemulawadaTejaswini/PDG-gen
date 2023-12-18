import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec, min, hour;
        System.out.print("秒数を入力：");
        sec = sc.nextInt();

        hour = sec / 3600;
        min = (sec%3600) / 60;
        sec = sec % 60;

        System.out.println(hour+":"+min+":"+sec);
    }
}
