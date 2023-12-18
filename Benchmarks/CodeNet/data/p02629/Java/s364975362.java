import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
	String[] lo = reader.readLine().split(" ");
	int X = Integer.parseInt(lo[0]);
	int N = Integer.parseInt(lo[1]);
	String p = reader.readLine();
	int[] list = !p.equals("")?Arrays.stream(p.split(" ")).mapToInt(Integer::parseInt).toArray():new int[0];
	HashSet<Integer> hs = new HashSet<>();
	for(int i = 0;i<N;i++) hs.add(list[i]);
	int t = 0;
	while(true){
		if(!hs.contains(X-t)){
			System.out.println((X-t));
			return;
		}
		else if(!hs.contains(X+t)){
			System.out.println((X+t));
			return;	
		}
		t++;	
	}
	}
}
