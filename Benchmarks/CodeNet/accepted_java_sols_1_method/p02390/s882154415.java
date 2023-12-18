import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = Integer.parseInt(scan.next());
        int hour = s/3600;
        int minute = (s - 3600*hour) /60;
        int second = s - 3600*hour - 60*minute;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}