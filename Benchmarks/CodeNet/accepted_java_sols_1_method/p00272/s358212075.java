import java.util.*;

public class Main {
	public static void main(String args[]){
		HashMap<Integer,Integer> ticket = new HashMap<Integer,Integer>();
		ticket.put(1,6000);
		ticket.put(2,4000);
		ticket.put(3,3000);
		ticket.put(4,2000);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++){
			System.out.println(ticket.get(sc.nextInt())*sc.nextInt());
		}
	}
}