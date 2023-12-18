import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,x,y; 
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			
			int[] z = new int[2];
			
			for(int i = 0; i < n; i++){
				x = sc.nextInt();
				y = sc.nextInt();
				
				if(x == y){
					z[0] += x;
					z[1] += y;
				}
				else{
				if(x < y)z[1] += x + y;
				else z[0] += x + y;
				}
			}
			
			System.out.println(z[0] + " " + z[1]);
		}
		sc.close();
	}
}