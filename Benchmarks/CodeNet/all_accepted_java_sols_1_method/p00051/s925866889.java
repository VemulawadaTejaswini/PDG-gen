import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t!=0){
			char[] a = scan.next().toCharArray();
			
			Arrays.sort(a);
			int m = Integer.parseInt(new String(a));
			char[] b = new char[8];
			for(int i=0;i<8;i++){
				b[i]=a[7-i];
			}
			System.out.println(Integer.parseInt(new String(b))-m);
			
			t--;
		}
	}
}