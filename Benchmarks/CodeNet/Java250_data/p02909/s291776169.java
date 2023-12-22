import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String s1="Sunny";
		String s2="Cloudy";
		String s3="Rainy";
		if(s.equals(s1)){
			System.out.println(s2);
		}else if(s.equals(s2)){
			System.out.println(s3);
		}else
			System.out.println(s1);
		
	}

}
