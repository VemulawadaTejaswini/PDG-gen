import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		List<Integer> list_x=new ArrayList<Integer>();
		List<Integer> list_y=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list_x.add(x);
			list_y.add(y);
		}
		double count=0;
		int x = 1;
		for(int i=n;0<i;i--) {
			x = x*i;
		}
		//System.out.println(x);
		for(int i=0;n>i;i++) {
			for(int j=i+1;n>j;j++) {
				double sum = Math.sqrt(Math.pow(list_x.get(i)-list_x.get(j), 2)+
						Math.pow(list_y.get(i)-list_y.get(j), 2));
				//System.out.println(sum);
				count=count+sum;
				//System.out.println(i+"i");
				//System.out.println(j);
			}
		}
		if(n==2)
			System.out.println(count*2/x);
		else if(n==3)
			System.out.println(count*4/x);
		else if(n==4)
			System.out.println(count*12/x);
		else if(n==5)
			System.out.println(count*48/x);
		else if(n==6)
			System.out.println(count*240/x);
		else if(n==7)
			System.out.println(count*1440/x);
		else if(n==8)
			System.out.println(count*10080/x);
	}
}