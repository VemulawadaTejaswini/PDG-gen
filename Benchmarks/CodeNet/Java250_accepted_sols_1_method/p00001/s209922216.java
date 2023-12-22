import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int tmp;
		
		for(int i = 0;i<10;i++){
			tmp = scan.nextInt();
			
			if(tmp>max1){
				max3=max2;
				max2=max1;
				max1=tmp;
			}else if(tmp>max2){
				max3=max2;
				max2=tmp;
			}else if(tmp>max3){
				max3=tmp;
			}
		}
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	    
	}
}