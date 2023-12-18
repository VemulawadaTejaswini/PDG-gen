import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	char[] S = sc.next().toCharArray();
    	List<String> judge = new ArrayList<>();
    	int clear = 0;
    	int bnum = 1;
    	for (int i = 0; i < S.length; i++) {
    		if (S[i] == 'c') {
    			judge.add("No");
    		} else if (S[i] == 'a') {
    			if (clear < A + B) {
    				judge.add("Yes");
    				clear++;
    			} else {
    				judge.add("No");
    			}
    		} else {
    			if (clear < A + B && bnum <= B) {
    				judge.add("Yes");
    				clear++;
    				bnum++;
    			} else {
    				judge.add("No");
    			}
    		}
    	}
    	for (String res : judge) {
    		System.out.println(res);
    	}
    }
}