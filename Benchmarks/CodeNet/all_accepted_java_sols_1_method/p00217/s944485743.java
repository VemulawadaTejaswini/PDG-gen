import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int[] a = new int[n];
			int x,y,z,v;
			int babaa = 0;
			v = 0;
			
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
				x = sc.nextInt();
				y = sc.nextInt();
				z = x + y;
				if(v < z){
					babaa = a[i];
					v = z;
				}
			}
			System.out.println(babaa + " " + v);
		}sc.close();
	}
}