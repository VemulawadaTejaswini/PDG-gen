import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] list = new String[n];
		for(int i=0; i<n; i++){
			list[i] = in.next();
		}
		Arrays.sort(list);
		System.out.println(list[0]);
	}
}