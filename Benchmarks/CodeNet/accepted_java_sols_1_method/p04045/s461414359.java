import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] array = new char[K];
		int last = 0;
		for(int i = 0; i < K; i++){
			array[i] = sc.next().charAt(0);
			//System.out.println(array[i]);
		}
		boolean flag = true;
		while(flag){
			flag = false;
			//System.out.println("for" + N);
			String str = "" + N;
			char[] arrayStr = new char[str.length()];
			for(int i = 0; i < str.length();i++){
				arrayStr[i] = str.charAt(i);
				//System.out.println(arrayStr[i]);
			}
			loop:
			for(int i = 0; i < arrayStr.length; i++){
				//int hikaku = Integer.parseInt(arrayStr[i]);
				//int hikaku = arrayStr[i];
				for(int j = 0;j < array.length;j++){
					if(arrayStr[i] == array[j]){
						flag = true;
						N++;
						break loop;
					}
				}
			}
		}
		System.out.println(N);
	}
}