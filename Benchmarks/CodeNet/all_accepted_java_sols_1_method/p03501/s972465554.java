import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(n*a<b){
				System.out.println(n * a);
			}else{
				System.out.println(b);
			}
		}
	}
}