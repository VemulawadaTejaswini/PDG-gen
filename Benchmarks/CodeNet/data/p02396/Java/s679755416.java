import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(;sc.nextInt() != 0;){
			al.add(sc.nextInt());
		    
		}
		for(i=0;i<al.size();i++){
		    System.out.println("Case"+(i+1)+": "+al.get(i));
		}
		
	}

}
