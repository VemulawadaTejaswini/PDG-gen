import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String str = new String();
        int i = 1;
        while(in.hasNext()) {
            String buf = in.nextLine();
            if (buf == "0")
            	break;
            System.out.println("Case "+ i + ": " + buf);
            i++;
        }
    }
}