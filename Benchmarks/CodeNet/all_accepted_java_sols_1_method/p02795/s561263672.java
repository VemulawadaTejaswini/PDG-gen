import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int n = sc.nextInt();
    	int cnt = 1;
    	sc.close();
    	int t = Math.max(h, w);
    	while(n > (t * cnt)){
    		cnt++;
    	}
    	System.out.println(cnt);
    }
}