import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		boolean flag = true;
		while(flag){
			String[] input=sc.nextLine().split(" ");
			int[] num= new int[input.length];
			for(int i=0;i<input.length;i++){
				num[i]=Integer.parseInt(input[i]);
			}
			if(num[0]==0 && num[1]==0){
				break;
			}
			for(int H=0;H<num[0];H++){
				for(int W=0;W<num[1];W++){
					System.out.print("#");
				}
				System.out.println();				
			}
			System.out.println();				
		}
	}
}