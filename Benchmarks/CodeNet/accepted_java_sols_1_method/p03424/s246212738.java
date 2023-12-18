import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		
		boolean bl = false;
		for(int i=0; i<N; i++){
			s[i] = sc.next();
			if(s[i].equals("Y"))bl=true;
		}
		System.out.println(bl==true?"Four":"Three");
	}
}