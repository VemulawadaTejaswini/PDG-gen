import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner reader  =new Scanner(System.in);	
	 int r=reader.nextInt();
	 int g=reader.nextInt();
	 int b=reader.nextInt();
	 int c=r*100+g*10+b*1;
	 if(c%4==0) {
		 System.out.println("YES");
		 
	 }
	 else {
		 System.out.println("NO");
	 }
	}

}
