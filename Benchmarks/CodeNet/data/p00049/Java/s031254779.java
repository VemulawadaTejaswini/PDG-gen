import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a, b, o, ab;
	static String[] line = new String[2];
	public static void main(String[] args) {
		while(read()){

		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		line = sc.next().split(",");
		char word = line[1].charAt(0);
		if(word == 'A' && line[1].length() == 1){
			a++;
		}else if(word == 'A' && line[1].length() == 2){
			ab++;
		}
		if(word == 'B'){
			b++;
		}else if(word == 'O'){
			o++;
		}
		return true;
	}
}