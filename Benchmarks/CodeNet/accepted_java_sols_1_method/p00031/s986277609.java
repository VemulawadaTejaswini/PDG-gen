import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int a = scan.nextInt();
			List<Integer> l = new ArrayList<Integer>();
			
			for(int i = 0; i < 10; i++){
				
				if((a & 1 << i) != 0)l.add(1 << i);
			}
			boolean h = true;
			for(int i:l){
				if(!h)System.out.print(" ");
				h = false;
				System.out.print(i);
			}
			System.out.println();
		}
	}
}