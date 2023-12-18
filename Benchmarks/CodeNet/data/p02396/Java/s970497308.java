import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	void testcase(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int tmp;
		tmp = s.nextInt();
		while(tmp != 0){
			array.add(tmp);
			tmp = s.nextInt();
		}
		for(int i = 0;i < array.size();i++){
			tmp = array.get(i);
			System.out.println("Case " + i + ": " + tmp);
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.testcase();
	}
}