import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
		int H=sc.nextInt();
		int W=sc.nextInt();
		if(H==0 && W==0){
			break;
		}
		for(int a=0;a<H;a++){
		for(int i=0;i<W;i++){
			if(a!=0 && a!=H-1){
				if(i==0){
				
					System.out.print("#");
				}
				if(i==W-1){
					System.out.print("#");
				}
					
				if(i!=W-1 && i!=0 ){
				
					System.out.print(".");
					
				}
			}
		if(a==0 || a==H-1){
			
				System.out.print("#");
			}
		}

		
		System.out.println();
	}

	System.out.println();
}
}
}