import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s  = sc.next();

		s = s.replace('A', '#');
		s = s.replace('T', '#');
		s = s.replace('G', '#');
		s = s.replace('C', '#');
		s = s + "?";
		String[] y = s.split("");

		int count = 0;
		int ans = 0;

		for(int i = 0; i<s.length(); i++){
			if(y[i].equals("#")){
				count++;
			}else{
				if(ans<count){
					ans=count;
					count = 0;
				}
			}
		}

		System.out.println(ans);
		
	}
}
