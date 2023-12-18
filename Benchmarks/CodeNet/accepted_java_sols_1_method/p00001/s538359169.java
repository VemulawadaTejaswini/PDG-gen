import java.util.*;

class Main {
	public static void main(String[] args) {
		//int[] ary= {1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922};
		Scanner scan = new Scanner(System.in);
		
		Integer[] ary= new Integer[10]; 
		//ArrayList<Integer> ary = new ArratList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			ary[i] = scan.nextInt();
		}

		int max1 = 0, max2 = 0, max3 = 0, temp = 0;
		
		for(int height:ary) {
			if(max3 < height) {
				if(max2 < height) {
					if(max1 < height) {
						max3 = max2;
						max2 = max1;
						max1 = height;
					}
					else {
						max3 = max2;
						max2 = height;
					}
				}
				else {
					max3 = height;
				}
			}
		}
		/*
		Arrays.sort(ary);
		
		for(int i : ary) {
			System.out.println(i);
		}
		
		
		max1 = ary[9];
		max2 = ary[8];
		max3 = ary[7];
		*/
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
		
	}
}