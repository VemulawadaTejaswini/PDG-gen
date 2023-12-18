import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		int c = 0;
		while(s>0){
			if(s%10!=0)
				c++;
			s/=10;
		}
		
		System.out.println(c);
	}

}
