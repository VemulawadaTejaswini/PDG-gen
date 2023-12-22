import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	sc.close();
    	int[] cnt = new int[2];
    	for(int i = 0; i < S.length(); i++){
    		cnt[S.charAt(i) - '0']++;
    	}
    	System.out.println(Math.min(cnt[0], cnt[1]) * 2);
    }
}