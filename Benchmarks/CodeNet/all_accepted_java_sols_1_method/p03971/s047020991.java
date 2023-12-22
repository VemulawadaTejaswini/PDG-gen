import java.util.*;
public class Main {// Main
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	int A = in.nextInt();
    	int B = in.nextInt();
    	String S = in.next();
    	char[] input = S.toCharArray();
    	int passed = 0;
    	int oversea = 0;
    	for(int i=0; i<N; i++){
    		if(input[i]=='a'){
    			if(passed<A+B){
    				System.out.println("Yes");
    				passed++;
    				continue;
    			}
    		}else if(input[i]=='b'){
    			if(passed<A+B && (oversea<B)){
    				System.out.println("Yes");
    				passed++;
    				oversea++;
    				continue;
    			}
    		}
    		System.out.println("No");
    	}
    	in.close();
    }
}