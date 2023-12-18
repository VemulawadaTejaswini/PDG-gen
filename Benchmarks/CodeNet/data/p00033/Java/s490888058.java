import java.util.*;
import java.text.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int btop = in.nextInt();
			int ctop = 0;
			boolean check = true;
			for(int j=0; j<9; j++){
				int ball = in.nextInt();
				if(btop>ball && ctop>ball){
					check = false;
					break;
				}else if(btop>ctop){
					if(ball>btop) btop = ball;
					else ctop = ball;
				}else{
					if(ball>ctop) ctop = ball;
					else btop = ball;
				}
			}
			if(check) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}