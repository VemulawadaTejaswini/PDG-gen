import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("0.5000000000");
        }else{
            int shou = a / 2;
            System.out.println((double)(a-shou)/a);
        }

    }
}