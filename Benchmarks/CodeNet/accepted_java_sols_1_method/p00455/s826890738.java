import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] attendA = new int[3];
		int[] leavA = new int[3];
		
		int[] attendB = new int[3];
		int[] leavB = new int[3];
		
		int[] attendC = new int[3];
		int[] leavC = new int[3];
		
		for(int i = 0; i < 3; i++) {
			attendA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			leavA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			attendB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			leavB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			attendC[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			leavC[i] = sc.nextInt();
		}
		
		attendA[0]*=3600;
		attendB[0]*=3600;
		attendC[0]*=3600;
		
		leavA[0]*=3600;
		leavB[0]*=3600;
		leavC[0]*=3600;
		
		attendA[1]*=60;
		attendB[1]*=60;
		attendC[1]*=60;
		
		leavA[1]*=60;
		leavB[1]*=60;
		leavC[1]*=60;
		
		int atdSumA = 0;
		int atdSumB = 0;
		int atdSumC = 0;
		
		for(int i = 0; i < 3; i++) {
			atdSumA+=attendA[i];
			atdSumB+=attendB[i];
			atdSumC+=attendC[i];
		}
		
		int lvSumA = 0;
		int lvSumB = 0;
		int lvSumC = 0;
		
		for(int i = 0; i < 3; i++) {
			lvSumA+=leavA[i];
			lvSumB+=leavB[i];
			lvSumC+=leavC[i];
		}
		
		int subA = lvSumA - atdSumA;
		int subB = lvSumB - atdSumB;
		int subC = lvSumC - atdSumC;
		
		int[] inA = new int[]{0, 0, 0};
		int[] inB = new int[]{0, 0, 0};
		int[] inC = new int[]{0, 0, 0};
		
		while(subA > 0) {
			if(subA >= 3600) {
				subA-=3600;
				inA[0]++;
			} else if(subA >= 60) {
				subA-=60;
				inA[1]++;
			} else {
				subA--;
				inA[2]++;
			}
		}
		
		while(subB > 0) {
			if(subB >= 3600) {
				subB-=3600;
				inB[0]++;
			} else if(subB >= 60) {
				subB-=60;
				inB[1]++;
			} else {
				subB--;
				inB[2]++;
			}
		}
		
		while(subC > 0) {
			if(subC >= 3600) {
				subC-=3600;
				inC[0]++;
			} else if(subC >= 60) {
				subC-=60;
				inC[1]++;
			} else {
				subC--;
				inC[2]++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(inA[i]);
			} else {
				System.out.print(inA[i] + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(inB[i]);
			} else {
				System.out.print(inB[i] + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(inC[i]);
			} else {
				System.out.print(inC[i] + " ");
			}
		}
		
		System.out.println();
	}
}