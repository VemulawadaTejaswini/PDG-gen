import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count = 0;
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String word = s.next().toLowerCase();
		while(s.hasNext()){
			String input = s.next().toLowerCase();
			if(input.equals("end_of_text")){
				break;
			}
			if(word.equals(input)){
				count++;
			}
		}
		s.close();
		System.out.println(count);
	}
}