import java.util.Scanner;


public class Main {
		
	public static void main(String[] args){	
		Scanner sc  =new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			double d = (double)(a)/b;
			String str = "" + d;
			
			int sum = 0;
			int i = 0;
			boolean upper = true;
			for(char c:str.toCharArray()){
				if(upper){
					if(c == '.'){
						upper = false;
					}
				}else{
					i++;
					sum += c - '0';
					
					if(i >= n){
						break;
					}
				}
			}
			
			 System.out.println("" + sum);
			
		}
	}
}