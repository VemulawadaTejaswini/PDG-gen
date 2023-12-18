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
		int sum = 0;
		
		for(int a = 0; a < i.length - 1; a++){
			if(max < i[a+1]){
				max = i[a+1];
			}
			if(min > i[a+1]){
				min = i[a+1];
			}
		}
		
		for(int a = 0; a < i.length; a++){
			sum = sum + i[a];
		}
		
		
		
		System.out.println(min + " " + max + " " + sum);
	}
}
