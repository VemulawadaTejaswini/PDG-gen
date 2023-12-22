import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int z=10000;
		int j=10000;
		int k=0;
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;n>i;i++) {
			list.add(l+i);
		}
		//System.out.println(list);

		for(int i=0;n>i;i++) {
			if(Math.abs(list.get(i))<z) {
				z=Math.abs(list.get(i));
				j=i;
				//System.out.println(Math.abs(list.get(i)));
				//System.out.println(j);
			}
			//System.out.println(i);
		}
		list.remove(j);
		for(int i=0;list.size()>i;i++) {
			k=k+list.get(i);
		}
		System.out.println(k);
	}

}
