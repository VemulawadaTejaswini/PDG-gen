import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int max=Integer.valueOf(sc.next());
		int min=max;
		
		for(int i=1;i<n;i++){
			int next=Integer.valueOf(sc.next());
			if(next>max)max=next;
			if(next<min)min=next;
		}
		System.out.println(max-min);
	}
}