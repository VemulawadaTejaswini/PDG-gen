import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		Integer[][] array = new Integer[n][m];
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for(int i=0;n>i;i++) {
			for(int j=0;m>j;j++) {
				int a = sc.nextInt();
				array[i][j]=a;
			}
		}
		int count=0;
		for(int i=0;n>i;i++) {
			int keisan=0;
			for(int j=0;m>j;j++) {
				keisan=keisan+list.get(j)*array[i][j];
			}
			if(keisan+c>0)
				count++;
		}
		System.out.println(count);
	}
}

