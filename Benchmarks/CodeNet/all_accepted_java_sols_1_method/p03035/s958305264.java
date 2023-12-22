import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans=0;

		if(A>12){
			ans=B;
		} else if(A>5 && A<13){
			ans=B/2;
		}else if(A<6){
			ans=0;
		}

		System.out.println(ans);
	}
}