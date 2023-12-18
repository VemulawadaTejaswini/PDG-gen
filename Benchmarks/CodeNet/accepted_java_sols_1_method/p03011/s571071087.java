
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int P=sc.nextInt(),Q=sc.nextInt(),R=sc.nextInt();
		
		int min=P+Q;
		
		if(P+R<min) {
			min=P+R;
		}
		if(Q+R<min) {
			min=Q+R;
		}
		
		System.out.println(min);
		
		
		
	}

	
}
		
