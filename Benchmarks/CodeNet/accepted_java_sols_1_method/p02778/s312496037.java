import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	sc.close();
    	s = s.replaceAll(".", "x");
    	System.out.println(s);
    }
}