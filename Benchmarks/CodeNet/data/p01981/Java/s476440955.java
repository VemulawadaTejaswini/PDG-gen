
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			String str=in.next();
			if(str.charAt(0)=='#')break;
			int y=in.nextInt(),m=in.nextInt(),d=in.nextInt();
			
			if(y>31 || (y>=31 && m>=5)) {
				str="?";y-=30;
			}
			System.out.println(str+" "+y+" "+m+" "+d);
		}
	}

}

