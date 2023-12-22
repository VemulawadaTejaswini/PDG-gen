import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> suraimu = new ArrayList<>();
		int sum = sc.nextInt();
		int count = 0;
		for(int i = 0; i < sum; i++){
			int color = sc.nextInt();
			if(!suraimu.contains(color)){
				suraimu.add(color);
			}else if(color == suraimu.get(i - 1)){
				suraimu.add(0);
				count += 1;
			}else{
				suraimu.add(color);
			}
		}
		System.out.println(count);
	}
}