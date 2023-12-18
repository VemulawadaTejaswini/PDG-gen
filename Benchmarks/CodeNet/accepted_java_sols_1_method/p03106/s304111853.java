import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer>ans  = new ArrayList<>();

    int cou = 0;
    for(int i=1; i<=100; i++) {
    	if(A%i==0 && B%i==0) {
    		ans.add(i);
    		cou++;
    	}
    	}
 Collections.sort(ans);
 
    System.out.println(ans.get(cou-K));
    }
}