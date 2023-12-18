import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),c= 0;
		int[] b = new int[a];
		for(int i = 0;i<a;i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0;i<a;i++){
			for(int j = i+1;j<a;j++){
				c += b[i]*b[j];
			}
			
		}
		System.out.println(c);
	}
}