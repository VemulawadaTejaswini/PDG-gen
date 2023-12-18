import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int x,y;
			x=cin.nextInt();
			y=cin.nextInt();
			if(x==0 && y==0)
		    	break;
			if(x>=y){
				System.out.println(y+" "+x);
			}else if(x<y){
				System.out.println(x+" "+y);
			}
		}
	}

}