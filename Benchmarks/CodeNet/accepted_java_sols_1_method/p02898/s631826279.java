import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		//List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count=0;

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			if(a>=k)
				count++;
		}

		System.out.println(count);

	}

}