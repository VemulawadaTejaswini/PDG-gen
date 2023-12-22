import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.parseInt(line);

		if(n==1){
			n=0;
        }
		else if(n==0){
			n=1;
        }
		System.out.println(n);
	}
}