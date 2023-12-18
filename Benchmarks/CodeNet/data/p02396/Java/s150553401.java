import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String str = new String();
        while(in.hasNext()) {
            String buf = in.nextLine();
            if (buf == "0")
            	break;
            System.out.println(buf);
        }
        System.out.println("");
    }
}