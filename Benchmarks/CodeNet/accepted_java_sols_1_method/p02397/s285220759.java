import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int[] intArray = {x,y};
			if(intArray[0] == 0 & intArray[1] == 0){
				break;
			}else{
				if(intArray[0] > intArray[1]){
					int num = intArray[0];
					intArray[0] = intArray[1];
					intArray[1] = num;
				}
				
			}
			System.out.println(intArray[0] + " " + intArray[1]);

		}
		
	}
}
