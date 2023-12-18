import java.util.*;

public class SwappingTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>();

		while(sc.hasNextLine()){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 0 && b == 0){
				break;
			}

			if(a > b){
				int tmp = a;
				a = b;
				b = tmp;
			}	

			result.add(a + " " + b);
		}

		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}