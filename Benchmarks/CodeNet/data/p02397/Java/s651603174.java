import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> listx = new ArrayList<Integer>();
		List<Integer> listy = new ArrayList<Integer>();
		for(;;){
			String line = new Scanner(System.in).nextLine();
			if(line.equals("0 0")){
				break;
			}
			String[] numbers = line.split("\\s");
			int x = Integer.parseInt(numbers[0]);
			int y = Integer.parseInt(numbers[1]);
			if(x > y){
				int small = y;
				y = x;
				x = small;
			}
			listx.add(x);
			listy.add(y);
		}

		for(int i = 0; i < listx.size(); i++){
			System.out.printf("%d %d\n", listx.get(i), listy.get(i));
		}
	}
}