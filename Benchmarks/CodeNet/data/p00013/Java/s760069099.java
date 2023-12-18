import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> stack = new ArrayList<Integer>();
		ArrayList<Integer> exit = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			if(a==0){
				exit.add(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
			}
			else {
				stack.add(a);
			}
		}
		for(int i=0; i<exit.size(); i++){
			System.out.println(exit.get(exit.size()-1));
		}
	}

}