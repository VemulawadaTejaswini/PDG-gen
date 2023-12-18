import java.util.Scanner; 
public class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
     
    		String T = sc.nextLine();
    		String S = sc.nextLine();
     
    		StringBuilder t = new StringBuilder();
    		StringBuilder s = new StringBuilder();
     
    		t.append(T);
    		s.append(S);
     
    		int count = 0;
     
    		for(int i=0;i<t.length();i++) {
    			if(t.substring(i,i).equals(s.substring(i, i))) {
     
    			}else {
    				count++;
    			}
    		}
     
    		System.out.println(count);
     
    	}
     
    }