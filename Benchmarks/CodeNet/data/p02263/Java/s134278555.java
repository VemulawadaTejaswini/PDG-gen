import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> expr = new ArrayList<String>();
		while(s.hasNext()){
			expr.add(s.next());
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>();
		Integer left = 0;
		Integer right = 0;
		while(expr.size() > 0){
			if(expr.get(0).equals("+")){
				right = buffer.remove(buffer.size() - 1);
				left = buffer.remove(buffer.size() - 1);

				buffer.add(left + right);
				expr.remove(0);
			}
			else if(expr.get(0).equals("-")){
				right = buffer.remove(buffer.size() - 1);
				left = buffer.remove(buffer.size() - 1);

				buffer.add(left - right);
				expr.remove(0);
			}
			else if(expr.get(0).equals("*")){
				right = buffer.remove(buffer.size() - 1);
				left = buffer.remove(buffer.size() - 1);

				buffer.add(left * right);
				expr.remove(0);
			}
			else{
				buffer.add(toi(expr.remove(0)));
			}
		}
		System.out.println(buffer.get(0));
	}
	private static Integer toi(String b){
		return Integer.parseInt(b);
	}

}