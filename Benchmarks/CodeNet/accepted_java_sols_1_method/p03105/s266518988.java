import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();

        if(price * count < money) {
        	System.out.println(count);
        }else{
        	System.out.println(money/price);
        }     
    }
}