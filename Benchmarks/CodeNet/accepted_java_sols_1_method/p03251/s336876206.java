import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < a; i++){
			int e= sc.nextInt();
			list1.add(e);
		}
		for(int i = 0; i< b; i++){
			int f = sc.nextInt();
			list2.add(f);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		for(int i = c+1; i<=d; i++){
			if(list1.get(a-1)<i && list2.get(0)>=i){
				System.out.println("No War");
				return;
			}
		}
		System.out.println("War");
	}
}