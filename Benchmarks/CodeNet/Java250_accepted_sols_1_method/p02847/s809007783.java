public class Main {

	public static void main(String[] args) {
		
		String input_str = new java.util.Scanner(System.in).nextLine();

		String[] str = {"SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
		for(int i = 0; i < 7; i++) {
			if(input_str.equals(str[i])){
				System.out.println(i + 1);
			}
		}
	}

}