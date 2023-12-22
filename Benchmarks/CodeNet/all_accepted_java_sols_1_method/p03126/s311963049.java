import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String[] nm  = in.nextLine().split(" ");
    	int n, m;
    	n = Integer.parseInt(nm[0]);
    	m = Integer.parseInt(nm[1]);
    	int[] likeFoods = new int[m];
    	
    	for (int i = 0; i < n; i++) {
    		int k = in.nextInt();
    		for (int j = 0; j < k; j++) {
    			likeFoods[in.nextInt()-1]++;
    		}
    	}
    	
    	int counter = 0;
    	for (int foods: likeFoods) {
    		if (foods == n) {
    			counter++;
    		}
    	}
    	
    	System.out.println(counter);
    	
    	
    }
}
