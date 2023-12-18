import java.util.Scanner;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
	
		ArrayList<Integer> x = new ArrayList<Integer>();
		int y = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int temp = sc.nextInt();
			if(temp == 0)
				break;
			x.add(temp);
		}
			
		for(i = 0; i < x.size(); i++){	
			
			int val = x.get(i);
			
			System.out.println("Case " + y + ": " + val);
			y++;
		}
		

	}

}