import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a <10){
            System.out.println(a);
        }else if(a<100){
            System.out.println(9);
        }else if(a<1000){
            System.out.println(9 + a-100+1);
        }else if(a<10000){
            System.out.println(9 + 900);
        }else if(a<100000){
            System.out.println(909 + a-10000+1);
        }else if(a==100000){
            System.out.println(9 + 900 + 90000);
        }



    }
}