import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	int K = sc.nextInt();
    	String S = sc.next();

    	if(S.length()<=K) {
    		System.out.println(S);
    	} else {
    		System.out.println(S.substring(0, K)+"...");
    	}

    }
}