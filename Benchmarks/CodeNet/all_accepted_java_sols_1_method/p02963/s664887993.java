import java.util.*;

public class Main{
	public static void main(String[]args){
      Scanner sc =  new Scanner(System.in);
      long S = Long.parseLong(sc.next());
      
      long x1 = 1000000000, y1 = 1;
      long x2 = (x1-S%x1)%x1;
      long y2 = ((S-1)/x1+1);
	  System.out.println("0 0 "+x1+" "+y1+" "+x2+" "+y2);
	}
}
