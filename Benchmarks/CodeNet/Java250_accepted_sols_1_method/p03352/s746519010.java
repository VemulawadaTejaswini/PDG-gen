import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//String N = in.nextLine();
		double a = in.nextDouble();
		int b = (int)Math.sqrt(a);
		int max = 1;
		for(int i=2; i<=b; i++){
			int tmp = i;
			while(true){
				if(tmp*i <= a){
					tmp = tmp * i; 
					if(max < tmp){
						max = tmp;
					}
				}else{
					break;
				}
			}
		}
		System.out.print(max);
	
		in.close();
	}
}