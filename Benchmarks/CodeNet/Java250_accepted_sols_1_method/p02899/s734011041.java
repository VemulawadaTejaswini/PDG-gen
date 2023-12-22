import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		Integer[] array = new Integer[n];
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			array[a-1] =i;
		}
		for(int i=0;n>i;i++) {
			System.out.print(array[i]+1);
			if(i!=n-1)
				System.out.print(" ");
		}
	}
}