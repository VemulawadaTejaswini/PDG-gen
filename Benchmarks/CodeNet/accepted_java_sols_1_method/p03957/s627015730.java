import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int len = s.length();
		int pos = 0;
		boolean y = false;
		
		for(int i=0; i<len; i++){
			if(s.charAt(i) == 'C'){
				pos = i;
				y = true;
				break;
			}
		}
		
		if(y){
			y = false;
			for(int i= pos; i<len; i++){
				if(s.charAt(i) == 'F'){
					y = true;
					break;
				}
			}
		}
		if(y){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
