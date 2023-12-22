import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	sc.close();
    	s = s.replaceAll("hi", "");
    	if(s.equals("")){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
    }
}