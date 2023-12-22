import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		int xx = sc.nextInt();
		int[] ll = new int[nn];
		long res = 0;
		int i=0;
		
		for (i=0;i<nn;i++){
			ll[i] = sc.nextInt();
		}
		
		for (i=0;i<nn;i++){
			res += ll[i];
			if(res >xx){
				break;
			}
		}
		
		System.out.print(i+1);
	}
}