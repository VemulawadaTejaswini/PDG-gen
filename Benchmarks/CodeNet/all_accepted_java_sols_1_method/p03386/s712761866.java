import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = Integer.parseInt(in.next());
		int B = Integer.parseInt(in.next());
		int K = Integer.parseInt(in.next());
		int c = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = A;i <= B; i++){
			if(i - A < K || B - i < K)list.add(i);
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)System.out.println(list.get(i));
	}
}