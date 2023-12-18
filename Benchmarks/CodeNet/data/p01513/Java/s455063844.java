import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	int n;
	List<List<Integer>> list;

	public void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			list=new ArrayList<List<Integer>>();
			for(int i=0;i<n;i++){
				List<Integer> tmp=new ArrayList<Integer>();
				int m=sc.nextInt();
				for(int j=0;j<m;j++){
					tmp.add(sc.nextInt());
				}
				list.add(tmp);
			}
			List<Integer> s=new ArrayList<Integer>();
			int m=sc.nextInt();
			for(int i=0;i<m;i++){
				s.add(sc.nextInt());
			}

			int i=1;

			int val=-1;
			for(List<Integer> l:list){
				if(l.containsAll(s)){
					if(val!=-1){
						val=-1;
						break;
					}
					val=i;
				}
				i++;
			}
			pr(val);
		}
	}

	public static void pr(Object o){
		System.out.println(o);
	}
	public static void main(String[] _) {
		new Main().run();
	}
}