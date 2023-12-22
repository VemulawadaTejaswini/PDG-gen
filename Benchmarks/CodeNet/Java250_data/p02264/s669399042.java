
import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Queue<String> qu = new LinkedList<>();
		Scanner scan = new Scanner(System.in);

		int amt = scan.nextInt();
		int quant = scan.nextInt();
		
		for(int i=0; i<amt; i++){
			qu.add(scan.next() + " " + scan.next());
			
		}
		
		int timer = 0;
		int q = quant;
		int i=0;
		String[] results = new String[amt];
		while(qu.size() > 0) {
			String[] temparr = qu.peek().split("\\s+");
			String name = temparr[0];
			int num = Integer.parseInt(temparr[1]);
			if(q>num) {
				timer += num;
				//q= q-num;
				num=0;

			} else if(num>q){
				timer += q;
				num = num - q;
				q=0;

			} else {

				timer += q;
				num=0;
				q=0;

			}

			if(num==0 && qu.size() > 0 && q==0) {
				results[i]=name + " " + timer;
				i++;
				q = quant;
				qu.remove();
			} else
			if(num==0 && qu.size() > 0) {
				results[i]= name + " " + timer;
				i++;
				qu.remove();

			} else
			if(q==0 && qu.size() > 0) {
				q = quant;
				qu.remove();
				qu.add(name + " " + num);
			}
			
		}
		for(int j=0; j<results.length;j++) {
			System.out.println(results[j]);
		}
		
	}
	
}

