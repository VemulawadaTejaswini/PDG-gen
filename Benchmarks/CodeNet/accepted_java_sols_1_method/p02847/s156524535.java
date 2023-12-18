import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String[] a = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int[] b = {7,6,5,4,3,2,1};

		for(int i = 0 ; i < b.length ; i++){
			if(a[i].equals(s)){
				System.out.println(b[i]);
			}
		}
	}
}