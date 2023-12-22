import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
      	int t = scn.nextInt();
      	int s = scn.nextInt();
      	
      	int time = d/s;
      	if(d%s != 0) time++;
      
      	if(time <= t) System.out.println("Yes");
        else System.out.println("No");
	}
}
