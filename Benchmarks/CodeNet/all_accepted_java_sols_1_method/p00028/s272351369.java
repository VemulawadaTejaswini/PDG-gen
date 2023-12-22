import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[100];
		int n;
		int max = 0;
		
		while(scan.hasNextInt()){
			n = scan.nextInt();
			
			a[n-1]++;
		}
		
		for(int i = 0; i < 100; i++){
			if(a[i] > max)max = a[i];
		}
		
		for(int i = 0; i < 100; i++){
			if(a[i] == max)System.out.println(i + 1);
		}
	}
}