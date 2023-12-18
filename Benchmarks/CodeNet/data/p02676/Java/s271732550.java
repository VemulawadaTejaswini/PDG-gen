import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
    	String S = sc.next();
    	sc.close();
    	if(S.length() <= K){
    		System.out.println(S);
    	}else{
    		System.out.println(S.substring(0, K) + "...");
    	}
    }
}