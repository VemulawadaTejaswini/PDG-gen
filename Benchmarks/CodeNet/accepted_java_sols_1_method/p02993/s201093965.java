import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

	    Scanner scanner = new Scanner(System.in);
	    String line1 = scanner.next();
        String tmpStr = "";
        boolean chkflg = false;
        String[] strArray = line1.split("");
        for(String s : strArray) {
            if (tmpStr.equals(s)) {
              chkflg = true;
            }
            tmpStr = s;
        }
        if (chkflg) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");   
        }
    }
}