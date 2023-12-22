import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<Integer> list=new ArrayList<Integer>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		int n = sc.nextInt();
		int d = sc.nextInt();

		int count=0;
		int human=0;

		while(true) {
			count=count+d*2+1;
			human++;
			if(count>=n) {
				break;
			}
		}

		System.out.println(human);
	}

}
