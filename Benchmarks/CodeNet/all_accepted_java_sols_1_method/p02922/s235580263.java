
import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=1;
		int count=0;
		for(int i=0;;i++){
			if(total>=b){
				break;
			}
			total--;
			total+=a;
			count++;
		}
		System.out.println(count);


	}
}
