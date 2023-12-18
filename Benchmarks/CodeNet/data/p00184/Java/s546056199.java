import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int[] h = new int[7];
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			if(n < 10)h[0]++;
			else if(n < 20)h[1]++;
			else if(n < 30)h[2]++;
			else if(n < 40)h[3]++;
			else if(n < 50)h[4]++;
			else if(n < 60)h[5]++;
			else h[6]++;
		}
		
		for(int i = 0; i < 7; i++){
			System.out.println(h[i]);
		}
	}
}