import java.util.*;
 
class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	boolean f = false;
	for(int i = 1; i <= b; i++) {
		if((a * i) % b == c) {
			f = true;
			break;
		}
	}
	if(f == false) {
		System.out.println("NO");
	} else {
		System.out.println("YES");
	}
}
}