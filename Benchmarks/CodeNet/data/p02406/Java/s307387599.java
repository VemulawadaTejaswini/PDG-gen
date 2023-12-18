import java.util.Scanner;

class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(3 <= n && n <= 10000){
		int x;
		
		for(x = 3; x <= n; x++){
			
			int y = x;
			int z = 0;
			
			if(0 == y % 3){
				System.out.print(" " + x);
				z++;
			}
			
			else 
			{
				while(z == 0)
				{
					if(3 == y % 10)
					{
						System.out.print(" " + x);
						z++;
					}
					y = y / 10;
					if(y < 3){
						z++;
					}
				}
			}
	  }
		System.out.println("");
    }
	}		
}