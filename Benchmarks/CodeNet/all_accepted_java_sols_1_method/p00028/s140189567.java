import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[101];
		int[] m = new int[101];
		
		while(sc.hasNext()){
			n[sc.nextInt()]++;
		}
		
		m = Arrays.copyOf(n,101);
		Arrays.sort(m);
		for(int i=0;i<101;i++){
			if(n[i]==m[100]){
				System.out.println(i);
			}
		}
	
	}	
}