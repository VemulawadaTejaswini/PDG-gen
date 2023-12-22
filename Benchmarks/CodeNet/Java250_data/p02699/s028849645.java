import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());
		if (s<=w){
			System.out.print("unsafe");
		}else{
			System.out.print("safe");
		}


	}
}
//end
