import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int nums;
		int cnt = 0;
		int num1[];
		num1 = new int[num]; 
		
		for(int i=0; i<num; i++)
			num1[i] = scan.nextInt();
		
		for(int i=0; i<num; i++){
			
			for(int j=num-1; j>=i+1; j--){
				if(num1[j] < num1[j-1]){
					nums = num1[j];
					num1[j]=num1[j-1];
					num1[j-1]=nums;
					cnt++;
				}
			}
		}	
		for(int i=0; i<num; i++){
			if(i>0)System.out.print(" ");
			System.out.print(num1[i]);
			if(i==num-1)System.out.println();
		}
		System.out.println(cnt);
		
	}

}