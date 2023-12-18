import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int r = 0;
		if(n < 600){
			r = 8;
		}else if(n < 800){
			r = 7;
		}else if(n < 1000){
			r = 6;
		}else if(n < 1200){
			r = 5;
		}else if(n < 1400){
			r = 4;
		}else if(n < 1600){
			r = 3;
		}else if(n < 1800){
			r = 2;
		}else{
			r = 1;
		}
		System.out.println(r);
	}
}
