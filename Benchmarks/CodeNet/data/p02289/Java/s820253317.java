import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		String inst;
		String[] instSplit;
		int ans;
		while(true)
		{
			inst = scn.nextLine();
			if(inst.equals("end"))
				break;
			if(inst.contains("i"))
			{
				instSplit = inst.split(" ");
				pq.offer(Integer.parseInt(instSplit[1]));
			}else
			{
				ans = pq.remove();
				System.out.println(ans);
			}
		}
		
		scn.close();
	}
}

