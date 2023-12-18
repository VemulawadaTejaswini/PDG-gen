
import java.util.Scanner;




public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		while(true){
			int n = sn.nextInt(), A = sn.nextInt(), B = sn.nextInt(), C = sn.nextInt(), x = sn.nextInt();
			if(n == 0 && A == 0 && B == 0 && C == 0 && x == 0) break;
			MyRand rand = new MyRand(A, B, C, x);
			int Y[] = new int[n];
			for(int i = 0; i < n; i++) Y[i] = sn.nextInt();
			
			for(int i = 0; i < n; i++){
				if(i == 0 && Y[i] == rand.x) continue;
				int j = 1;
				while(Y[i] != rand.getRand()){
					if(rand.getCount() > 10000) break;
				}
				if(rand.getCount() > 10000) break;
				
			}
			System.out.println(rand.getCount() > 10000? -1: rand.getCount());
		}
	}
}


class MyRand{
	private int A, B, C;
	int x;
	int count = 0;
	public MyRand(int A, int B, int C, int x) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.x = x;
	}
	
	public int getRand(){
		count++;
		return (x = (A*x+B)%C);
	}
	
	public int getCount(){
		return count;
	}
	
	public int getSeed(){
		return x;
	}
	
	public void setSeed(int seed){
		x = seed;
	}
}