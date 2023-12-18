import java.util.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int val[] = new int[3];
		
		for(int i=0; i<3; i++) { 
			val[i] = sc.nextInt();
		}
		
		int tmp = 0;
		for(int i=0; i<2; i++) {
			if (val[i] > val[i+1]) {
				tmp = val[i];
				val[i] = val[i+1];
				val[i+1] = tmp;
			}
		}
		
		if(val[0] > val[1]) {
			tmp = val[0];
			val[0] = val[1];
			val[1] = tmp;
		}
		
		System.out.println(val[0] + " " + val[1] + " " + val[2]);
	}
}
