import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String step = sc.next();
		boolean flag = true;
		for(int i = 0; i < step.length(); i++){
			if(i % 2 == 0 && step.charAt(i) == 'L'){
				flag = false;
				break;
			}
			else if(i % 2 == 1 && step.charAt(i) == 'R'){
				flag = false;
				break;
			}
		}
		
		System.out.println((flag)?"Yes":"No");
	}
}