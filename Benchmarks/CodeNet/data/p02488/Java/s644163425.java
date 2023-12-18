import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		setInputToList(scanner.nextInt(), input);
		System.out.println(getMinimumString(input));
	}
	
	private static void setInputToList(int n, ArrayList<String> list){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++){
			list.add(sc.next());
		}
	}
	
	private static String getMinimumString(ArrayList<String> list){
		String result = list.get(0);
		for(int i = 1; i < list.size(); i++){
			String target = list.get(i);
			if(result.compareTo(target) > 0){
				result = target;
			}
		}
		return result;
	}
}