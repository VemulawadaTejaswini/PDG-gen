import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    String t = s.nextLine();
	    t.replace("apple", "#####");
	    t.replace("peach", "apple");
	    t.replace("#####", "peach");
	    System.out.println(t);
	}
    }
}