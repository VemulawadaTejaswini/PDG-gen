import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
    	new AOJ().doIt();
    }
    
    class AOJ{
    	void doIt(){
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		while(in.hasNext())list.add(in.nextInt());
    		Collections.sort(list);
    		for(int i=list.size()-1;i>=list.size()-3;i--)System.out.println(list.get(i));
    		
    	}
    }
    
}