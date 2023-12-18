import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0){
            String number = Integer.toString(n);
            int sum = 0;
            for(int x = 0; x < number.length();x++) {
                sum = sum + Integer.parseInt(Character.toString(number.charAt(x)));
            }
            System.out.println(sum);
            n = scan.nextInt();
        }
    }
}
