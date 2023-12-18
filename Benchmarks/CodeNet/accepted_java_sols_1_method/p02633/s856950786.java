import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		for(int i=1; ; i++){
			if(n * i % 360 == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
