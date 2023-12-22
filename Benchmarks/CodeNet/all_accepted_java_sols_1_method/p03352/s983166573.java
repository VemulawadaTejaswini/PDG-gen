import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		
		int max=1;
		for(int t=2;t<=(int)Math.sqrt(X);t++){
			int s=1;
			while((int)Math.pow(t,s) <= X){
				s++;
			}
			if(max < (int)Math.pow(t,s-1)) max = (int)Math.pow(t,s-1);
		}

		System.out.println(max);
		
	}
}