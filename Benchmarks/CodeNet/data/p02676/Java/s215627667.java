import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.nextLine();

        if(s.length() < k) {
        	System.out.println("s");
        } else {
        	String ss = s.substring(0, k);
        	System.out.println(ss + "...");
        }



        scan.close();
    }


}