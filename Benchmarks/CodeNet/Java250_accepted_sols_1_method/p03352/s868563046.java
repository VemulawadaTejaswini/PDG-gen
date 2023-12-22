import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int max = 0;

		if(X!=1){
			for(int b=2; b<Math.sqrt(X); b++){
				int p=2;
				int pow = (int) Math.pow(b,p);
				while(pow<=X){
					if(max<pow){
						max=pow;
					}
					p++;
					pow = (int) Math.pow(b,p);
				}
			}
		}else{
			System.out.println("1");
			return;
		}
		System.out.println(max);
    }
}