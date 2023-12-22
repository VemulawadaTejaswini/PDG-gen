import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();


    	ArrayList<Integer> result = new ArrayList<>();

    	for(int i=0;i<N;i++) {
    		result.add(sc.nextInt());
    	}
    	Collections.sort(result);
    	int min = result.get(0);
    	int max = result.get(N-1);
    	int ans = 10000000;
    	for (int i=min;i<=max;i++) {
    		int sum = 0;
    		for(int j=0;j<N;j++) {
    			sum += (result.get(j)-i)*(result.get(j)-i);
    		}
    		if(sum<ans) {
    			ans = sum;
    		}
    	}
    	System.out.println(ans);
    }

}