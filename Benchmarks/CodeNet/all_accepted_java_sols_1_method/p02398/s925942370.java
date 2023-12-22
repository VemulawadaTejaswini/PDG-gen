import java.util.Scanner;

public class Main {

	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int answer = 0;
		for(;a <=b; a++){
			
			if(c % a == 0){
				answer++;
			}
		}
		System.out.println(answer);
		
		sc.close();
	}
	

}

