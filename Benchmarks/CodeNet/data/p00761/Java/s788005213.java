import java.util.*;
public class Main {
	static int L;
	static ArrayList<Integer> num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			
			int a00 = sc.nextInt();
			L = sc.nextInt();
			if (a00 == 0 && L == 0)  break;
			num = new ArrayList<Integer>();
			num.add(new Integer(a00));
			solve(a00);
		}
	}
	static void solve(int a0) {
			
		int[] a = new int[L];
			
		int i = 0;	
		for (; a0 > 1; i++) {
			a[i] = a0 % 10;
			a0 = a0 / 10;
		}
		for (; i < L; i++) {
			a[i] = 0;
		}
		System.out.print("a");
		for (int j = 0; j < L; j++) {
			System.out.print(a[j]+ " ");
		}
		System.out.println();
			
		int temp;
		for (int j = 0; j < L-1; j++) {
			for(int k = j + 1; k < L; k++) {
				if (a[j] < a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		
		System.out.print("a");
		for (int j = 0; j < L; j++) {
			System.out.print(a[j]+ " ");
		}
		System.out.println();
			
		int large = 0;
		for (int j = 0; j < L-1; j++) {
			large = large + a[j];
			large = large * 10; 		
		}
		large = large + a[L-1];
					
		int small = 0;
		for (int j = L-1; j > 0; j--) {	
			small = small + a[j];
			small = small * 10; 
		}
		small = small + a[0];
			
		Integer ai = new Integer(large-small);
		
		System.out.println(large + " " + small + " " + (large-small));
				
		if (num.contains(ai)) {
			System.out.println(num.indexOf(ai) + " " + (large-small) + " " + (num.size()-num.indexOf(ai)));
			
		} else {
			num.add(ai);
			solve(large-small);
		}
			
			
	}	
}

