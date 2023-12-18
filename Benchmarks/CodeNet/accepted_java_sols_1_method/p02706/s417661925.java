import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        for(int i=0;i<b;i++){int c = sc.nextInt();
                            a-=c;}
		System.out.println(Math.max(-1,a));
	}
}
