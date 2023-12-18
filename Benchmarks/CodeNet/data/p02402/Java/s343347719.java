import java.util.*;
class Main {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] i = new int[n];
		
		for(int b = 0; b < n; b++){
			i[b] = sc.nextInt();
		}
		
		int max = i[0];
		int min = i[0];
		int sum = i[0];
		
		for(int a = 1; a < i.length; a++){
			if(max < i[a]){
				max = i[a];
			}
			if(min > i[a]){
				min = i[a];
			}
			sum = sum + i[a];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
