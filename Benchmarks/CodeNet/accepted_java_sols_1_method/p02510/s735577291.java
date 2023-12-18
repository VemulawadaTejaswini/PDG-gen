import java.util.*;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String i;
			int n;
			i = sc.next();
			if(i.equals("-")){
			break;
			}
			n=sc.nextInt();
			for(int j = 0; j<n;j++){
				int h = sc.nextInt();
				i=i.substring(h)+i.substring(0,h);
			}
			System.out.println(i);
		}
	}
}