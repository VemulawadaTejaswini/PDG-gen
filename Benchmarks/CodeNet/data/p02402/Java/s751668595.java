import java.util.*;
class Main {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] i = new int[n];
		int max = i[0];
		int min = i[0];
		int sum = 0;
		
		for(int a; a < i.length -1; a++){
			if(i[a] < i[a+1]){
				max = i[a+1];
			}
			if(i[a] > i[a+1]){
				min = i[a+1];
			}
			sum = sum + i[a];
		}
		
		System.out.println(min + " " + max + " " + sum);
	}
}
