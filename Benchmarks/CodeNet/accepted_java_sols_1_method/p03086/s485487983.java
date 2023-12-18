import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.replaceAll("A", "-");
		s = s.replaceAll("C", "-");
		s = s.replaceAll("T", "-");
		s = s.replaceAll("G", "-");
		if (s.contains("----------")){
			System.out.println(10);
		} else if (s.contains("---------")){
			System.out.println(9);
		} else if (s.contains("--------")){
			System.out.println(8);
		} else if (s.contains("-------")){
			System.out.println(7);
		} else if (s.contains("------")){
			System.out.println(6);
		} else if (s.contains("-----")){
			System.out.println(5);
		} else if (s.contains("----")){
			System.out.println(4);
		} else if (s.contains("---")){
			System.out.println(3);
		} else if (s.contains("--")){
			System.out.println(2);
		} else if (s.contains("-")){
			System.out.println(1);
		} else{
			System.out.println(0);
		}
	}
}