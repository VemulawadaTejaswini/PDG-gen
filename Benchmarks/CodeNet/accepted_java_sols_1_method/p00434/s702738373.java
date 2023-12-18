import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int[] n = new int[31];
			for(int i=0;i<28;i++){
				n[sc.nextInt()]++;
			}
			
			for(int i=1;i<31;i++){
				if(n[i]==0)System.out.println(i);
			}
						
		}
	}
}