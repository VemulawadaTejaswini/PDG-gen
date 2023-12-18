import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m, max, min;
		while(true){
			m = sc.nextInt();
			min = sc.nextInt();
			max = sc.nextInt();
			sc.nextLine();
			if(m == 0) break;

			int[] array = new int[m];
			for(int i = 0; i < m; i++){
				array[i] = sc.nextInt();
			}
			sc.nextLine();
			
			int dif, gap=0, pos=0;
			for(int i = min - 1; i < max; i++){
				dif = array[i] - array[i+1];
				if(gap <= dif){
					gap = dif;
					pos=i;
				}
			}
			System.out.println(pos+1);
		}
	}
}