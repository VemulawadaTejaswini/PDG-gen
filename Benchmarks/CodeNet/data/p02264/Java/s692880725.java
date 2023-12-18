import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		LinkedList<String> listN = new LinkedList<String>();
		LinkedList<String> listFN = new LinkedList<String>();
		LinkedList<Integer> listT = new LinkedList<Integer>();
		LinkedList<Integer> listFT = new LinkedList<Integer>();
		
		int n = 0;
		int q = 0;
		int result = 0;
		int finT = 0;
		
		n = Integer.parseInt(as.next());
		q = Integer.parseInt(as.next());
		for(int i=0;i<n;i++){
			
			listN.add(as.next());
			listT.add(Integer.parseInt(as.next()));
			
		}
		
		while(listT.size() != 0){
			
			if((result = listT.peek() - q) <= 0){
				
				finT += listT.peek();
				listFN.add(listN.peek());
				listFT.add(finT);
				listN.removeFirst();
				listT.removeFirst();
				
			}
			else{
				
				finT += q;
				listT.set(0, result);
				listT.offer(listT.poll());
				listN.offer(listN.poll());
				
			}
			
		}
		for(int i=0;i<n;i++){
			
			sb.append(listFN.get(i)).append(" ").append(listFT.get(i));
			System.out.println(sb.toString());
			sb.setLength(0);
			
		}

	}

}