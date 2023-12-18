import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String message = "";
		while(sc.hasNext()){
			message += sc.next();
		}
		sc.close();
		char[] chars = message.toCharArray();
		Arrays.sort(chars);
		ArrayList<Character> chars_arraylist = new ArrayList<>();
		for(int i = 0; i < chars.length; i++){
			chars_arraylist.add(chars[i]);
		}
		String alphabet = "abcdefghijklmnopqrstuvwzyz";
		for(int i=0; i < alphabet.length(); i++){
			Character c = alphabet.charAt(i);
			System.out.println(c +  " : " + get_count(chars_arraylist, c));
		}
	}

	private static Integer get_count(ArrayList<Character> chars_arraylist, Character c){
			Integer count = 0;
		if(chars_arraylist.indexOf(c) != -1){
			count = count + chars_arraylist.lastIndexOf(c) + 1 - chars_arraylist.indexOf(c);
		}
		Character upper_c = Character.toUpperCase(c);
		if(chars_arraylist.indexOf(upper_c) != -1){
			count = count + chars_arraylist.lastIndexOf(upper_c) + 1 - chars_arraylist.indexOf(upper_c);
		}
		return count;
	}

}