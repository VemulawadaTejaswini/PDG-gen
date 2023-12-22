import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int values[] = new int[5];
		for(int i = 0;i<5;i++){
			values[i] = Integer.parseInt(sc.next());
		}
		int W = values[0];
		int H = values[1];
		int x = values[2];
		int y = values[3];
		int r = values[4];
		
		if((0<=x-r && x+r <= W) && (0<=y-r && y+r <=H)){
			
			System.out.println("Yes");
		}else{
			
			System.out.println("No");
		}
		
		sc.close();
		
	}

}
