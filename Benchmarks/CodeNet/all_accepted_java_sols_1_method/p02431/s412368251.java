import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> A = new ArrayList<>();
		int x;
		int q;
		int y;
		x=sc.nextInt();
		
		for(int i=0;i<x;i++) {
			q = sc.nextInt();
			
			if(q==0) {
			y=sc.nextInt();	
			A.add(y);
				
		}
			else if(q==1) {
				y=sc.nextInt();	
				System.out.println(A.get(y));
			}else if(q==2) {
				A.remove(A.size() - 1);
			}else {
				System.out.println("error");
			}
		
	}
	
}
}

