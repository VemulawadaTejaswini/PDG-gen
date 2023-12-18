import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	sc.close();
    	int ans = 753;
    	for(int i = 0; i < s.length()-2; i++){
    		int num = Integer.parseInt(s.substring(i, i+3));
    		ans = Math.min(ans, Math.abs(num - 753));
    	}
    	System.out.println(ans);
    }
}
