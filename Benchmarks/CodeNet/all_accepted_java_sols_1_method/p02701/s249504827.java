import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			al.add(sc.next());
		}
		ArrayList<String> al2 = new ArrayList<String>(new HashSet<>(al));
		System.out.println(al2.size());
	}
}