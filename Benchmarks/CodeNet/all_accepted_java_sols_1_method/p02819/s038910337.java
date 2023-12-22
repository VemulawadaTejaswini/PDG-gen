import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int x = sc.nextInt();
		int flag=0;
		if(x==2) {
			System.out.println(2);
			System.exit(0);
		}
		for(int i=x;10000000>i;i++) {
			for(int j=2;i>j;j++) {
				if(i%j==0) {
					break;
				}
				if(j+1==i)
					flag=1;
			}
			//System.out.println(i);
			if(flag==1) {
			System.out.println(i);
			System.exit(0);
			}
		}
	}
}