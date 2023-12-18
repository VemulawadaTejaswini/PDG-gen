import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int[] a;
		int o;
		int i;
		String str;
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			a = new int[n];
			
			for(int j = 0;j < n; j++){
				a[j] = scan.nextInt(); 
			}
			
			o = 32;
			i = 0;
			while(o>=0){
				o -= (o-1)%5;
				if(o < 0)System.out.println(0);
				else System.out.println(o);
				o -= a[i];
				i++;
				if(i == n)i = 0;
				if(o < 0)System.out.println(0);
				else System.out.println(o);
			}
		}
	}
}