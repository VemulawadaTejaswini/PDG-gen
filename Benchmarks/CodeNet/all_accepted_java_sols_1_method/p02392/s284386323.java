import java.util.*;

public class Main {
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] data = str.split(" ");
	int a = Integer.parseInt(data[0]);
	int b = Integer.parseInt(data[1]);
	int c = Integer.parseInt(data[2]);

	
	if(a < b && b < c) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
    }
 
}
