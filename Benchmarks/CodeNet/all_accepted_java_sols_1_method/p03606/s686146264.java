import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 0;
        int c,d;
        for(int i=0;i<a;i++){c = sc.nextInt();
                             d = sc.nextInt();
                             b+=d-c+1;}	
		System.out.println(b);
	}
}
