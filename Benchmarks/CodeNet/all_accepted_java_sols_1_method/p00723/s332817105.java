import java.util.*;
public class Main {
	private static Scanner sc;
    public static void main(String[] args){
    	TreeSet<String> all = new TreeSet<String>();
    	sc = new Scanner(System.in);
    	int a=sc.nextInt();
    	for (int j=0; j<a; j++){
    		String word=sc.next();
    		for (int i=1; i<word.length(); i++){
    			String front =  word.substring(0, i);
    			String revfront = new StringBuffer(front).reverse().toString();
    			String back = word.substring(i,word.length());
    			String revback = new StringBuffer(back).reverse().toString();
    			all.add(front+back);
    			all.add(back+front);
    			all.add(front+revback);
    			all.add(revback+front);
    			all.add(revfront+back);
    			all.add(back+revfront);
    			all.add(revfront+revback);
    			all.add(revback+revfront);
    		}
    		System.out.println(all.size());
    		all.clear();
    	}	
    }
}