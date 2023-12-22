import java.util.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int counter=0;
		int N= sc.nextInt();
		int K= sc.nextInt();
		int h=0;
		for(int i =1; i <=N; i++){
			h=sc.nextInt();
			if(h>=K){
				 counter++;
			 }
		 }
		 System.out.println(counter);


	}
}
