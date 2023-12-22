import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char[] c1 = scan.nextLine().toCharArray();
        char[] c2 = scan.nextLine().toCharArray();
        char[] c3 = scan.nextLine().toCharArray();

        System.out.println(String.valueOf(c1[0]) + String.valueOf(c2[1]) + String.valueOf(c3[2]));
        
        scan.close();
    
    }

}