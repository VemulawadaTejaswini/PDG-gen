import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int count = 0;

		for(int i = 0; i < 10000; i ++){
			H -= A;
			if(H <= 0){
				break;
			}
			count ++;
		}
		System.out.println(count + 1);
	}
}