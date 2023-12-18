import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<9;i++){
			String name=sc.next();
			int am=sc.nextInt(), pm=sc.nextInt();
			System.out.printf("%s %d %d\n",name,am+pm,am*200+pm*300);
		}
	}
}