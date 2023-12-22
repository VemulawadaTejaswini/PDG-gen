import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	String zeroOmitted = line.replaceAll("0", "");
        System.out.println(zeroOmitted.length());
    }
}