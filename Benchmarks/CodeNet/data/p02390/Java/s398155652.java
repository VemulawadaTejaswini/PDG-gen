import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60 % 60;
        System.out.println(hour+":"+minute+":"+second);
    }
}
