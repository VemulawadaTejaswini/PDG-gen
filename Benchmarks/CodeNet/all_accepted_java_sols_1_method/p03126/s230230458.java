import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] array = new Integer[m];
		for(int i=0;m>i;i++) {
			array[i] = 0;
		}
		for(int i=0;n>i;i++) {
			int k = sc.nextInt();
			for(int j=0;k>j;j++) {
				int a = sc.nextInt();
				array[a-1] = array[a-1]+1;
			}
		}
		int count=0;

		for(int i=0;m>i;i++) {
			if(array[i]>n-1)
				count++;
		}
		System.out.println(count);
	}
}


