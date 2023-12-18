import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int result=0;
		boolean flag = false;
		for(int i = 0; i < 3; i++){
			if(str.charAt(i) == 'R'){
				result++;
				flag = true;
			}
			else{
				if(flag == true) break;
			}
		}

		System.out.println(result);
	}
}
