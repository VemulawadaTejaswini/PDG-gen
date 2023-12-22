import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	sc.close();
    	if(a == b && b == c){
    		System.out.println("No");
    		return;
    	}else if(a  != b && b != c && a != c){
    		System.out.println("No");
    		return;
    	}
    	System.out.println("Yes");
    }
}