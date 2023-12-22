import java.util.*;

public class Main {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<Character> x = new ArrayList<Character>();
		int i, j, count = 0;
		for(i = 0; i < N; i++){
			char input = sc.next().charAt(0);
			x.add(input);
			for(j = 0; j < i; j++){
				if(x.get(j).equals(input)){
					count++;
					break;
				}
			}
		}
		if((N-count) == 3){
			System.out.println("Three");
		}else{
			System.out.println("Four");
		}
	}
}
