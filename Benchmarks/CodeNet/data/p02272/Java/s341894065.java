import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int num = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[Integer.parseInt(scanner.nextLine())];
		String[] strings = scanner.nextLine().split(" ");
		
		for(int i = 0; i < strings.length; i++) {
			a[i] = Integer.parseInt(strings[i]);
		}
		
		int[] b = sortlist(a);
		for(int i = 0; i < a.length - 1; i++) {
			System.out.print(b[i]+"　");
		}
		System.out.println(b[a.length - 1]);
		System.out.println(num);
		scanner.close();
	}
	
	private static int[] sortlist(int[] i) {
		if(i.length == 1) {
			return i;
		}else {
			
			int[] a = sortlist(Arrays.copyOfRange(i,0,i.length/2));
			int[] b = sortlist(Arrays.copyOfRange(i, i.length/2, i.length));
			int j = 0, k = 0;
			while(j < a.length && k < b.length) {
				num += 1;
				if(a[j] > b[k]) {
					i[j+k] = b[k];
					k++;
				}else {
					i[j+k] = a[j];
					j++;
				}
			}
			if(j == a.length) {
				while(k < b.length) {
					num += 1;
					i[j+k] = b[k];
					k++;
				}
			}else {
				while(j < a.length) {
					num+= 1;
					i[j+k] = a[j];
					j++;
				}
			}
			return i;
		}
	}
}
