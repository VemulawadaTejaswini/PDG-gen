import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s;
		int[] a, b, sum;
		s = 0;
		
		a = new int[200];
		b = new int[200];
		sum = new int[200];
		
		while(scan.hasNext()){
			
			a[s] = scan.nextInt();
			b[s] = scan.nextInt();
			if(a[s] == 0 && b[s] == 0) break;
			
			sum[s] = a[s] + b[s];
			s++;
		}
		
		for(int i = 0; i < s; i++){
			if(sum[i] < 10)System.out.println(1);
			else if(sum[i] < 100)System.out.println(2);
			else if(sum[i] < 1000)System.out.println(3);
			else if(sum[i] < 10000)System.out.println(4);
			else if(sum[i] < 100000)System.out.println(5);
			else if(sum[i] < 1000000)System.out.println(6);
			else System.out.println(7);
		}
	}
}