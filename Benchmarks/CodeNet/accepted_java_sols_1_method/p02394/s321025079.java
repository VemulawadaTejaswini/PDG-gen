import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		  Scanner s = new Scanner(System.in);
		  int[] WHxyr = {
				  s.nextInt(),
				  s.nextInt(),
				  s.nextInt(),
				  s.nextInt(),
				  s.nextInt()};

		  if(WHxyr[2] + WHxyr[4] <= WHxyr[0] 
				  && WHxyr[3] + WHxyr[4] <= WHxyr[1] 
				  && WHxyr[2] - WHxyr[4]  >= 0 
				  && WHxyr[3] - WHxyr[4]  >= 0 )
			  System.out.println("Yes");
		  else
			  System.out.println("No");
	}
}

