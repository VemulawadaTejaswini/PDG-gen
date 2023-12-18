import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2 = sc.nextInt();

        if(n >= 10 || n2 >= 10){
            System.out.println(-1);
        }else{
            System.out.println(n * n2);
        }

        //String n = sc.next();




    }
}
