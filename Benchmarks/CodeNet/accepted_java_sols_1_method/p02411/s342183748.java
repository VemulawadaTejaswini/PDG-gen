import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> grad = new ArrayList<String>();
		for(;;){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			if(m == -1 || f == -1){
				grad.add("F");
			} else if(m + f >= 80){
				grad.add("A");
			} else if(m + f >= 65){
				grad.add("B");
			} else if(m + f >= 50){
				grad.add("C");
			} else if((m + f >= 30) && r >= 50){
				grad.add("C");
			} else if(m + f >= 30){
				grad.add("D");
			} else if(m + f < 30){
				grad.add("F");
			}
		}

		for(String g : grad){
			System.out.println(g);
		}
	}
}