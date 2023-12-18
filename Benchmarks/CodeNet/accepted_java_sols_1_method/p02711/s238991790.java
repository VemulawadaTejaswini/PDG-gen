import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String N = sc.next();
    	sc.close();
    	System.out.println(N.contains("7")?"Yes":"No");
    }
}