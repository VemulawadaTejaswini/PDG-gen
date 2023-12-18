import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<String,Integer> map=new TreeMap<>();
		for(int i=0; i<n; i++){
			String s=sc.next();
			map.put(s,1);
		}
		System.out.println(map.size());
	}
}
