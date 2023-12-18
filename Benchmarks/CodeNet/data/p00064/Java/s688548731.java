import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0;
		while(sc.hasNext()){
			String s = sc.next();
			int start=0;
			for(int i=0;i<s.length();i++){
				if(s.codePointAt(i)>47 && s.codePointAt(i)<58){
					start = i;
					while(i<s.length() && s.codePointAt(i+1)>47 && s.codePointAt(i+1)<58)i++;
					sum += Integer.valueOf(s.substring(start,i+1));
				}
			}
		}
		System.out.println(sum);
	}
}