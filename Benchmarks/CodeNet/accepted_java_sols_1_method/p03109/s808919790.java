import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/|\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextInt();
        if(a <= 2019 && b <= 4){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }
}
