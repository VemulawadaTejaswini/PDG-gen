import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0;i < l.length;i++) {
			l[i] = sc.nextInt();
		}
		while(sum <= x) {
			if(count < l.length) {
				sum += l[count];
			}
			if(count <= l.length) {
				count++;
			}
			else break;
		}
		sc.close();
		System.out.println(count);
    }
}