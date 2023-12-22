import java.util.*;
public class Main {
	static final Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println(
				s.next()
				.replaceAll("[^CF]","")
				.contains("CF")
				?"Yes":"No");
	}
}
