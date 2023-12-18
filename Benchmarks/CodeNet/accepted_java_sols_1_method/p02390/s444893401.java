import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int hour = amount/3600;
        int min = (amount-(hour*60*60))/60;
        int sec = amount-(hour*60*60)-(min*60);
        System.out.println(hour+":"+min+":"+sec);
    }
}
