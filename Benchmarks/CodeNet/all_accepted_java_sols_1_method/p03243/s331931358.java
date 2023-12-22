import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		ArrayList<Integer> goals = new ArrayList<Integer>();
		goals.add(111);
		goals.add(222);
		goals.add(333);
		goals.add(444);
		goals.add(555);
		goals.add(666);
		goals.add(777);
		goals.add(888);
		goals.add(999);
		
		if(goals.contains(n)){flag=true;}
		
		while(n<=999&&flag==false){
			n++;
			flag = goals.contains(n);
		}
		
		System.out.println(n);
	}
}