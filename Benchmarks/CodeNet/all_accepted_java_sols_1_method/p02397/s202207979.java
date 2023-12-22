import java.util.Scanner;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		int a,b;
		
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a == 0 && b == 0)
				break;
			
			x.add(a);
			y.add(b);
			
		}
		
		int temp;
		int i;
		
		for(i = 0; i < x.size(); i++){
			int val1 = x.get(i);
			int val2 = y.get(i);
			
			if(val1 > val2){
				temp = val2;
				val2 = val1;
				val1 = temp;
			}
			
			System.out.println(val1 + " " + val2);
		}
		
	}

}