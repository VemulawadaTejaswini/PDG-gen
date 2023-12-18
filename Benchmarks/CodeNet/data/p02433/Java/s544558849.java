import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		List<Integer> L = new LinkedList<>();
		ListIterator<Integer> It = L.listIterator();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			int q = sc.nextInt();
			
			if(q == 0){
				int x = sc.nextInt();
				
				It.add(x);
				It.previous();
				
			}else if(q == 1){
				int d = sc.nextInt();
				
				if(d > 0){
					for(int j=0;j<d;j++)
					It.next();
					
				}else{
					for(int j=0;j< -d;j++)
						It.previous();
				}
			}else{
				It.next();
				
				It.remove();
			}
		}
		
			for(int k : L)
				System.out.println(k);
	}

}
