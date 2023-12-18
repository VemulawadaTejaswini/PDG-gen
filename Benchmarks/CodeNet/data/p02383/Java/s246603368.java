import java.util.Scanner;

class Main {
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int a[];
		a = new int[7];
		
		int n;
				
		for(int i = 1; i < 7; i++){
			
			n = scan.nextInt();
			a[i] = n;
		}
		
		String s = scan.next();
		char c[] = s.toCharArray();
		
		for(int i = 0; i < c.length; i++){
			if(c[i] == 'N'){
				a[0] = a[1];
				a[1] = a[2];
				a[2] = a[6];
				a[6] = a[5];
			}else
			if(c[i] == 'S'){
				a[0] = a[1];
				a[1] = a[5];
				a[5] = a[6];
				a[6] = a[2];				
			}else
			if(c[i] == 'E'){
				a[0] = a[1];
				a[1] = a[4];
				a[4] = a[6];
				a[6] = a[3];
			}else
			if(c[i] == 'W'){
				a[0] = a[1];
				a[1] = a[3];
				a[3] = a[6];
				a[6] = a[4];
			}
		}
		System.out.println(a[1]);
	}
}