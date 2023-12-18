import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] ary = new int[n];
    	int sum = 0;
    	for(int i = 0; i < n; i++){
    		 ary[i] = sc.nextInt();
    		 sum += ary[i];
    	}
    	sc.close();
    	int ans = 0;
    	double q = Math.round((double)sum / n);
    	for(int i = 0; i < n; i++){
    		ans += Math.pow((ary[i] - q), 2);
    	}
    	System.out.println(ans);
    }
}