import java.util.*;

public class Main{
	public static void main(String arga[]){
		
		Scanner sc = new Scanner(System.in);
		
		int X =sc.nextInt();
		int Y =sc.nextInt();
		int Z =sc.nextInt();
		int N =sc.nextInt();
		int count=0;
		
		
		for(int i=0;i<=X;i++){
			
			for(int j=0; j<=Y;j++){
				
				for(int k=0; k<=Z;k++){
					
				if(N==500*i+100*j+50*k){
					count++;
				}
			}
		}
		}
		
		System.out.println(count);
	}
}