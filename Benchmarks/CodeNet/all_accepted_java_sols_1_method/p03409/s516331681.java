import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] red = new int[n][2];
		int[][] blue = new int[n][2];
		for(int i = 0; i <n; i++) for(int j = 0; j<2; j++) red[i][j] = sc.nextInt();
		for(int i = 0; i <n; i++) for(int j = 0; j<2; j++) blue[i][j] = sc.nextInt();
		Arrays.sort(red,(array1, array2) -> array1[1] - array2[1]);
		Arrays.sort(blue, (array1, array2) -> array1[0] - array2[0]);
//		for(int[] a : red) System.out.println(a[0] +", " + a[1]);
//		for(int[] a : blue) System.out.println(a[0] + ", " + a[1]);
		Set<Integer> usedSet = new HashSet<>();
		for(int[] b : blue){
			int max = -1;
			for(int i = 0; i < red.length; i++){
				if(usedSet.contains(i) || red[i][0] >= b[0]) continue;
				if(red[i][1] >= b[1]) break;
				if(max == -1 || red[max][1] < red[i][1]) max = i;
			}
			if(max != -1) usedSet.add(max);
		}
		System.out.println(usedSet.size());
	}
}