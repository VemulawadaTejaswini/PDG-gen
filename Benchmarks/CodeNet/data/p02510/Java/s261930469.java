import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String w;
		int m;
		while(true){
			if ((w = sc.next()).equals("-")){
				break;
			} 
			m = sc.nextInt();
			
			for(int i = 0,index; i < m; i++){
				index = sc.nextInt();
				w = w.substring(index) + w.substring(0,index);
			}
			System.out.println(w);
		}
	}
}