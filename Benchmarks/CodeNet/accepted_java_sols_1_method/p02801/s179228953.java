import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	char[] cary = sc.next().toCharArray();
    	int code = (int)cary[0];
    	code++;
    	char c = (char)code;
    	sc.close();
    	System.out.println(c);
    }
}