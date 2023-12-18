import java.util.*;
class Main
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = 0;
			
			for(int i=1 ; i<=n ; i++){
				
				int num = 0;
				int suuti = i;
				
				do{
					num+= suuti%10;
					suuti /=10;
				}while(suuti!=0);
					
				
				if ( (a<=num) && (num<=b) ){
					sum += i;
				}
			}
			System.out.println(sum);
		}
}