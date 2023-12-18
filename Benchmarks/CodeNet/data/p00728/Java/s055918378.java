import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
	
		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				culc(value);
			}
			else{
				break;
			}
		}
	}
	public void culc(int value){
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i = 0; i < value; i++){
			n.add(sc.nextInt());
		}
		Collections.sort(n);
		n.remove(value-1);
		n.remove(0);
		int sum = 0;
		for(int i = 0; i < n.size(); i++){
			sum = sum + n.get(i);
		}
		System.out.println(sum/n.size());
	}
	public static void main(String[] args){
		new Main().run();
	}
}