import java.util.*;

public class Main {

	public static void main(String[] args) throws java.io.IOException{
		int x,i=0;
		while(true){
		i++;
		Scanner in = new Scanner(System.in);
			x = in.nextInt();
			if(x == 0){
				break;
			}else{
				System.out.println("Case " + i + ": " + x);
			}
		}
	}
}