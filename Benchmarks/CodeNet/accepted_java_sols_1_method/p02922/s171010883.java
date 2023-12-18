import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_origin=new ArrayList<Integer>();
		int a= sc.nextInt();
		int b = sc.nextInt();

		int count = 1;
		int answer =0;

		while(true) {
			if(count >= b)
				break;
			count=count-1;
			count=count+a;
			answer++;
			if(count >= b)
				break;
		}

		System.out.println(answer);
	}

}