import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> max = new LinkedList<Integer>();
		
		int n = stdIn.nextInt();
		max.add(n);		
		while( stdIn.hasNext() ){
			String[] s = stdIn.next().split(",");
			if( max.size() < s.length ){
				max.add(max.get(0)+Integer.parseInt(s[0]));
				for(int i = 1; i < s.length-1; i++){
					int x = max.get(i-1)+Integer.parseInt(s[i]);
					int y = max.get(i)+Integer.parseInt(s[i]);
					max.add(( x > y ) ? x : y);
				}
				max.add(max.get(s.length-2)+Integer.parseInt(s[s.length-1]));
				for(int i = 0; i < s.length-1; i++){
					max.remove(0);
				}
			} else {
				for(int i = 0; i < s.length; i++){
					int x = max.get(i)+Integer.parseInt(s[i]);
					int y = max.get(i+1)+Integer.parseInt(s[i]);
					max.add(( x > y ) ? x : y);
				}
				for(int i = 0; i < s.length+1; i++){
					max.remove(0);
				}
			}
			if( s.length == 1 ){
				break;
			}
		}
		System.out.println(max.get(0));
	}
}