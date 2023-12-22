import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int s,w;
		s = Integer.parseInt(scan.next());
		w = Integer.parseInt(scan.next());
		System.out.println(w >= s?"unsafe":"safe");
	}

}
//end