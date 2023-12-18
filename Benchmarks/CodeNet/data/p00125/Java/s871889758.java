import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner cin=new Scanner(System.in);
		int y,m,d,Y,M,D;
		while(true){
			y=cin.nextInt();m=cin.nextInt();d=cin.nextInt();Y=cin.nextInt();M=cin.nextInt();D=cin.nextInt();
			if(y==-1)return;
			System.out.println((new GregorianCalendar(Y,M,D).getTimeInMillis()-new GregorianCalendar(y,m,d).getTimeInMillis())/86400000);
		}
	}
}