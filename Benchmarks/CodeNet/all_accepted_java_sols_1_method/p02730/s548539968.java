import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	char[] S = sc.next().toCharArray();
    	sc.close();
    	boolean ans = true;
    	int len = S.length;
    	int t1 = len-1;
    	for(int i = 0; i < len/2; i++){
    		if(S[i] != S[t1]){
    			ans = false;
    		}
    		t1--;
    	}
    	t1 = (len-1)/2-1;
    	for(int i = 0; i < t1/2; i++){
    		if(S[i] != S[t1]){
    			ans = false;
    		}
    		t1--;
    	}
    	t1 = (len+3)/2-1;
    	int t2 = len-(t1-1)/2;
    	int t3 = len-1;
    	for(int i = t1; i < t2; i++){
    		if(S[i] != S[t3]){
    			ans = false;
    		}
    		t3--;
    	}
    	System.out.println(ans?"Yes":"No");
    }

}