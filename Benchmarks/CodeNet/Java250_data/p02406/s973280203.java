import java.util.*; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		int i=1;
		while(i<=n){
			int x=i;
			
			if(x%3==0){
				System.out.print(" "+i);
			}
			else include3(x,i);
			i++;
		}
		System.out.println();

	}
	
	static void include3(int x,int i){
		if(x%10==3){
			System.out.print(" "+i);
			return;
		}
		x/=10;
		if(x>=1)include3(x,i);
	}

}

