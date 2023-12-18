import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i=0,x;
		Scanner sc = new Scanner(System.in);
		while(true){
			x=sc.nextInt();
			if(x == 0) break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
	}

}