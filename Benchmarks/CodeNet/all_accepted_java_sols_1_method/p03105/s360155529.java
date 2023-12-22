import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int money = sc.nextInt();
        int max = sc.nextInt();

        System.out.println(Math.min((int)(money / price), max));
    }
}