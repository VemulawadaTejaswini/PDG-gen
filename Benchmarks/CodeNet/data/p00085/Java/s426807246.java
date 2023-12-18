import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(), m = stdIn.nextInt();
		while( n != 0 || m != 0 ){
			List<String> remain = new ArrayList<String>();
			for(int i = 1; i <= n; i++){
				remain.add(Integer.toString(i));
			}
			int del = m-1;
			while( remain.size() > 1 ){
				remain.remove(del);
				n--;
				del = (del+m-1)%n;
			}
			System.out.println(remain.get(0));
			n = stdIn.nextInt();
			m = stdIn.nextInt();
		}
	}
}