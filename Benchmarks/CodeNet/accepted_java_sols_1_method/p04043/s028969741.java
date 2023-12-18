import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[3];
	int f = 0;
	int s = 0;
	for(int i = 0; i < 3; i++) {
		a[i] = sc.nextInt();
	}
	for(int i = 0; i < 3; i++) {
		if(a[i] == 5) {
			f++;
		} else if(a[i] == 7) {
			s++;
		}		
	}
	if(f == 2 && s == 1) {
		System.out.println("YES");
	} else {
		System.out.println("NO");
	}
}
}