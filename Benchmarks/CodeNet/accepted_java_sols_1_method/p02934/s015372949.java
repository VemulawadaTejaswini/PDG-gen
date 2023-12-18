import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();

		double n = sc.nextInt();
		double bunbo =1;

		for(int i=0; n>i;i++) {
			int a = sc.nextInt();
			bunbo=bunbo*a;
			list.add(a);
		}

		double bunsi=bunbo/list.get(0);

		for(int i=1;n>i;i++) {
			bunsi=bunsi+bunbo/list.get(i);
		}

		double answer=bunbo/bunsi;

		System.out.println(answer);


		}

}