import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  //1, 1, 1, 2, 1,** 2, 1, 5, 2, 2,**1, 5, 1, 2, 1,** 14, 1, 5, 1, 5,** 2, 2, 1, 15, 2**, 2, 5, 4, 1, 4**, 1, 51
	  int n = sc.nextInt();
	  if(n == 4 ||  n ==6 || n==9 || n==10 || n == 14 || n == 21 || n == 22 || n == 25 || n == 26)
		  out.println(2);
	  else if (n == 8 || n == 12 || n ==18 || n == 20 || n == 27)
		  out.println(5);
	  else if(n == 16)
		  out.println(14);
	  else if(n == 24)
		  out.println(15);
	  else if(n ==28 || n == 30 )
		  out.println(4);
	  else if(n == 32)
		  out.println(51);
		  else
			  out.println(1);

  	}
  }	