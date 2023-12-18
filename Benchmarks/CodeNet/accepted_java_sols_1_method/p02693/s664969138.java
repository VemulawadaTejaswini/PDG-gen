import java.util.*;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p=0;
		for(int i=a;i<=b;i++){
			if(i%k==0){
				p = 1;
				break;
			}
		}
		if(p==1){
			System.out.println("OK");
		}
		else{
			System.out.println("NG");
		}


		

	}
}









