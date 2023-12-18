import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] num = new int[2];
			num[0]=sc.nextInt();
			num[1]=sc.nextInt();
			
			int cd0;
			int cd = 1;
			
			do{
				cd0 = 1;
				for(int j = 2; j<= getMin(num[0], num[1]); j++){
					if(num[0]%j == 0 && num[1]%j == 0){
						cd0 = j;
						cd = cd * j;
						num[0]=num[0]/j;
						num[1]=num[1]/j;
						break;
					}
				}
			}while(cd0 != 1);
			
			System.out.print(cd + " ");
			System.out.println(cd * num[0] * num[1]);
		}
	}
	
	private static int getMin(int a, int b){
		if (a>b){
			return a;
		}else{
			return b;
		}
	}
}