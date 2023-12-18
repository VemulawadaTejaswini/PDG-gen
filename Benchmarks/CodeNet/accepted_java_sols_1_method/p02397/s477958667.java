import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		int x,y;
		while(true){
			x = Integer.parseInt(s.next());
			y = Integer.parseInt(s.next());
			if(x==0&&y==0)break;
			if(x<=y)System.out.println(x+" "+y);
			else System.out.println(y+" "+x);
		}
	}
}
			