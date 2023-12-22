import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a * b;
        String s = " ";
        if (sum % 2 == 0 ){
            s = "Even";
        }else{
            s = "Odd";  
        }

        System.out.println(s);
        scan.close();
    }
}