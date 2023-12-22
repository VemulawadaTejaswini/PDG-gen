import java.util.*;
import java.util.stream.IntStream;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i = 0; i < d.length ; i++){
			d[i] = sc.nextInt();
		}
		
		IntStream stream = Arrays.stream(d);
		long MaxStack = stream.distinct().sorted().count();
		
		System.out.println(MaxStack);
	}
}
