import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int s = scan.nextInt();//3600
    int m = s / 60;//60
    int hour = m / 60;//1
    int second = s-m*60;
    int minute = m-hour*60;
    System.out.println(hour+":"+minute+":"+second);
    }
}
