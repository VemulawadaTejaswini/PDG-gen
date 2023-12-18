import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = 0,y=B;
		if((0<=A&&A<=100)&&(0<=B&&B<=100)&&(0<=C&&C<=100)) {
	while(y>=A && x<C) {
		y=y-A;
		x++;
	}
	System.out.println(x);
		}
	}
}