import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String a;

        if (n==3) {
            a="bon";
        }else if(n==0||n==1||n==6||n==8){
            a="pon";
        }else {
            a="hon";
        }
        System.out.println(a);
    }
}
