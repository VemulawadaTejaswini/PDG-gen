import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String b = sc.next();
    	sc.close();
    	switch(b){
    	case "A":
    		System.out.println("T");
    		break;
    	case "T":
    		System.out.println("A");
    		break;
    	case "C":
    		System.out.println("G");
    		break;
    	case "G":
    		System.out.println("C");
    		break;
    	default :
    		System.out.println("err");
    	}
    }
}