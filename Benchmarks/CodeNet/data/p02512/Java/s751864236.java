import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MainB {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n==0)break;
			TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
			for(int i=0;i<n;i++){int w=in.nextInt();m.put(in.nextInt(),w);}
			Set<Integer> s = m.keySet();
			int sw=0;
			boolean c= true;
			for(int k : s){
				sw+=m.get(k);
				if(k<sw){
					c=false;
					break;
				}
			}
			System.out.println(c?"Yes":"No");

		}
	}
}