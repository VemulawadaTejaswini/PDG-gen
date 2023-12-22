import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int cnt = 0;
		  
		for(int i=0; i<3; i++){

			if(str.equals("RSR")){
				cnt = 1;
				break;
			}
			if(str.charAt(i)=='S'){
				continue;
			}
			if(str.charAt(i)=='R'){
				cnt++;
			}

		}

        System.out.println(cnt);
		return;
	}
}
