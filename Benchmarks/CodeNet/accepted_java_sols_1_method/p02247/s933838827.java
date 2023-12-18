import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine(),key=in.nextLine();
		int i=0;
		while(true) {
			int p=str.indexOf(key, i);
			if(p==-1)break;
			System.out.println(p);
			i=p+1;
		}
	}

}

