import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = (b-1)/(a-1);
        if((b-1)%(a-1)!=0){c++;}
		System.out.println(c);
	}
}
