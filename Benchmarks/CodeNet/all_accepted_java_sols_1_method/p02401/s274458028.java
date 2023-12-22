import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int v = a.nextInt();
		String c = a.next();
		int w = a.nextInt();
		int flg = 1;
		if(c.equals("?"))
			flg = 0;
		while(flg > 0){
		if(c.equals("+")){
			System.out.println(v+w);
		}
		if(c.equals("-")){
			System.out.println(v-w);
		}
		if(c.equals("*")){
			System.out.println(v*w);
		}
		if(c.equals("/")){
			System.out.println(v/w);
		}
		if(c.equals("?")){
			return;
		}
		v = a.nextInt();
		c = a.next();
		w = a.nextInt();
		flg = 1;
		if(c.equals("?"))
			flg = 0;
		}
	}

}