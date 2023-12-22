import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		List<Integer> abc = new ArrayList<Integer>();
		for(int i = 0;i < 5;i++) abc.add(sca.nextInt());
		int min = abc.get(0),index = 0,time = 0;
		for(int i = 0;i < 5;i++) {
			if(min > abc.get(i) % 10 && abc.get(i)%10 != 0) {
				min = abc.get(i) % 10;
				index = i;
			}
		}
		for(int i = 0;i < 5;i++) {
			if(i != index) {
				if(abc.get(i)%10 != 0) time += abc.get(i) + (10 - (abc.get(i)%10));
				else time += abc.get(i);
			}
		}
		time += abc.get(index);
		System.out.println(time);
	}
}