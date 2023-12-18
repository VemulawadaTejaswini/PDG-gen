import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] array = new String[N];
		for(int i = 0; i < N; i++){
			//System.out.println(i + "moji");
			array[i] = sc.next();
		}
		Arrays.sort(array);
		String str = "";
		for(int i = 0;i < N;i++){
			str += array[i];
		}
		System.out.println(str);
	}
}