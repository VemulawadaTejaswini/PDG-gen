import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt(),min,hour;
        hour = (min = sec/60)/60;
        sec %= 60;
        min %= 60;
        System.out.println(hour+":"+min+":"+sec);
    }
}
