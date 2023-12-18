import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++){
			list.add(s.nextInt());
		}
		Collections.sort(list);
		int sum = 0;
		for(int i = 0; i < K; i++){
			sum += list.get(i);
		}
		System.out.println(sum);
		
		
			
	}
} 