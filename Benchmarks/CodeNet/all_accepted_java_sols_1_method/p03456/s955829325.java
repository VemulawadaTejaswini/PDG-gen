import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = 0;
	int lB = 0;
	boolean flag = false;
	if(b / 100 > 0) {
		lB = 3;
	} else if(b / 10 > 0) {
		lB = 2;
	} else {
		lB = 1;
	}
	c = a * (int)Math.pow(10, lB) + b;
	for(int i = 1; i <  500; i++) {
		if(c == (int)Math.pow(i, 2)) {
			System.out.println("Yes");
			flag = true;
			break;
		}
	}
	if(flag == false) {
		System.out.println("No");	
	}
}
}
