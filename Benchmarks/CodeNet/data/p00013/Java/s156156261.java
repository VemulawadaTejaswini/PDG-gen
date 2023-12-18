import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList();
		while(sc.hasNextInt()){
			a.add(sc.nextInt());
			if(a.get(a.size()-1) == 0){
				a.remove(a.size()-1);
				System.out.println(a.get(a.size()-1));
			    a.remove(a.size()-1);
			}
		}
	}
}