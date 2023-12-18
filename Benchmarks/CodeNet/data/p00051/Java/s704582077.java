import java.util.*;
public class Main {
	static List<Integer> henkan(String n){
		List<Integer> m = new ArrayList<Integer>();
		for(int i=0;i<n.length();i++)m.add(Integer.parseInt(n.charAt(i)+""));
		return m;
	}
	
	static int big (List<Integer> m){
		String a = "";
		Collections.sort(m);
		for(int s=m.size()-1;s>=0;s--)a+=m.get(s);
		return Integer.parseInt(a);
	}
	static int small (List<Integer> m){
		String a = "";
		Collections.sort(m);
		for(int s=0;s<m.size();s++)a+=m.get(s);
		return Integer.parseInt(a);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int k=0;k<n;k++){
			String input = in.next();
			List<Integer> m = henkan(input);
			System.out.println(big(m)-small(m));
		}
	}
}