import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> hoge=new ArrayList<>();
		ArrayList<Integer> ans=new ArrayList<>();

		int i;
		int std;
		int l;

		while(true) {
		int n=sc.nextInt();
		int r=sc.nextInt();

		if(n==0&&r==0)
			break;

		for(i=1;i<n+1;i++) {
			hoge.add(i);
		}

		for(i=0;i<r;i++) {
			int p=sc.nextInt();
			int c=sc.nextInt();

			for(l=0;l<c;l++) {
				std=hoge.remove(n-(p-1+c));
				hoge.add(std);
			}
		}
		ans.add(hoge.get(n-1));
		hoge.clear();
		}
	for(i=0;i<ans.size();i++)
		System.out.println(ans.get(i));
	sc.close();
	}

}
