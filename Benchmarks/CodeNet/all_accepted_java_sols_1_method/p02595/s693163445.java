import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int count=0;
		for(int q=1;q<=n;q++) {
			
			int x=scn.nextInt();
			int y=scn.nextInt();
			double dis=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
			if(dis<=d)
				count++;
			
			
		}
		System.out.println(count);
		
	}

}
