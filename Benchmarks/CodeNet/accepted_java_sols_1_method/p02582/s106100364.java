import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int i = 0;
		if(s.contains("RRR")) i = 3;
		else if(s.contains("RR")) i = 2;
		else if(s.contains("R")) i = 1;
		
		System.out.println(i);
	}
}
