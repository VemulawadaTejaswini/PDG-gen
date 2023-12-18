import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//int t = sc.nextInt();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();

		for(int i=0;list.size()-1>i;i++) {
			if(list.get(i).equals(list.get(i+1))){
				System.out.println("Bad");
				System.exit(0);
			}
		}
		System.out.println("Good");
	}

}
