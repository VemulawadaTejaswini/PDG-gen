import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==-1)break;
			System.out.println(Integer.toString(n,4));
		}
	}
}