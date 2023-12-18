import java.util.*;

public class Main {
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] data = str.split(" ");
	int a = Integer.parseInt(data[0]);
	int b = Integer.parseInt(data[1]);
	System.out.println(a * b + " " + (a + b) * 2);
    }
 
}
