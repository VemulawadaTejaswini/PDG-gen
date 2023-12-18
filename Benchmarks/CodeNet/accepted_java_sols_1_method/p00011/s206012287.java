import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int w = in.nextInt();
		for(int i=0; i<w; i++){
			list.add(i+1);
		}
		
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			String tmp = in.next();
			StringTokenizer str = new StringTokenizer(tmp, ",");
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int x = list.get(a-1);
			list.set(a-1, list.get(b-1));
			list.set(b-1, x);
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}