import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = "";
		while(true){
			String input = br.readLine();
			if(input == null){
				break;
			}
			message += input;
		}
		char[] chars = message.toCharArray();
		Arrays.sort(chars);
		ArrayList<Character> chars_arraylist = new ArrayList<>();
		for(int i = 0; i < chars.length; i++){
			chars_arraylist.add(chars[i]);
		}
		System.out.println("a : " + get_count(chars_arraylist, 'a'));
		System.out.println("b : " + get_count(chars_arraylist, 'b'));
		System.out.println("c : " + get_count(chars_arraylist, 'c'));
		System.out.println("d : " + get_count(chars_arraylist, 'd'));
		System.out.println("e : " + get_count(chars_arraylist, 'e'));
		System.out.println("f : " + get_count(chars_arraylist, 'f'));
		System.out.println("g : " + get_count(chars_arraylist, 'g'));
		System.out.println("h : " + get_count(chars_arraylist, 'h'));
		System.out.println("i : " + get_count(chars_arraylist, 'i'));
		System.out.println("j : " + get_count(chars_arraylist, 'j'));
		System.out.println("k : " + get_count(chars_arraylist, 'k'));
		System.out.println("l : " + get_count(chars_arraylist, 'l'));
		System.out.println("m : " + get_count(chars_arraylist, 'm'));
		System.out.println("n : " + get_count(chars_arraylist, 'n'));
		System.out.println("o : " + get_count(chars_arraylist, 'o'));
		System.out.println("p : " + get_count(chars_arraylist, 'p'));
		System.out.println("q : " + get_count(chars_arraylist, 'q'));
		System.out.println("r : " + get_count(chars_arraylist, 'r'));
		System.out.println("s : " + get_count(chars_arraylist, 's'));
		System.out.println("t : " + get_count(chars_arraylist, 't'));
		System.out.println("u : " + get_count(chars_arraylist, 'u'));
		System.out.println("v : " + get_count(chars_arraylist, 'v'));
		System.out.println("w : " + get_count(chars_arraylist, 'w'));
		System.out.println("x : " + get_count(chars_arraylist, 'x'));
		System.out.println("y : " + get_count(chars_arraylist, 'y'));
		System.out.println("z : " + get_count(chars_arraylist, 'z'));
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