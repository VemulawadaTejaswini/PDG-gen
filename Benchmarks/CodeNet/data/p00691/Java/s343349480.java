
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] pre = new long[1112];
		
		for(int i = 0; i < 1112; i++){
			long l = i;
			l = l * l * l;
			pre[i] = l;
		}
		
		while(true){
			final int z = sc.nextInt();
			
			if(z == 0){
				break;
			}
			
			long max = 0;
			
			for(int x = 1; ; x++){
				if(pre[z] < pre[x]){
					break;
				}
				
				for(int y = 1; y <= x; y++){
					if(pre[z] >= (pre[x] + pre[y])){
						max = Math.max(max, pre[x] + pre[y]);
					}
				}
			}
			System.out.println(pre[z] - max);
		}
		
	}

}