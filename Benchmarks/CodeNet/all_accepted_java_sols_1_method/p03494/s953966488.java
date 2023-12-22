import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int c = 0;
			while(a%2==0){
				a/=2;
				c++;
			}
			if(c<min)
				min = c;
		}
		
		System.out.println(min);
	}

}
