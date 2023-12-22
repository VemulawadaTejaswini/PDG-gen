import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,z=0;
		char A = 'A';
		char Z = 'Z';
		String s = sc.next();
		char sa[] = s.toCharArray();
		for(int i=0;i<sa.length;i++) {
			if(sa[i]==A) {
				a=i;
				break;
			}
		}
		for(int i=sa.length-1;i>0;i--) {
			if(sa[i]==Z) {
				z=i;
				break;
			}
		}
		System.out.print(z-a+1);
		sc.close();
	}
}
