import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        while (!n.equals("0")){
            int sum = 0;
            for(int x = 0; x < n.length();x++) {
                sum = sum + Integer.parseInt(Character.toString(n.charAt(x)));
            }
            System.out.println(sum);
            n = scan.nextLine();
        }
    }
}
