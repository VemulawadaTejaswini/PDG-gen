import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>ans =new ArrayList<>();

			int i;
			int j;
			int s=0;
			while(true) {
				int n=sc.nextInt();
				int p=sc.nextInt();
				if(n==0&&p==0)
					break;
				int []a=new int[n];
				int []key=new int[n];
				for(i=0;i>-1;i++){
					if(s==1)
						break;
					if(i==n)
						i=0;
					if(p>0) {	//おわんにある
						a[i]++;
						p--;;
						key[i]=1;
						if(p==0) {
							for(j=0;j<n;j++){
								if(j!=i && key[j]==1)
									break;
								else if(j==n-1) {
									s=1;
									ans.add(i);
								}
							}
						}
					}
					else {	//おわんが空
						p=a[i];
						a[i]=0;
						key[i]=0;
					}
				}
				s=0;
			}
			for(i=0;i<ans.size();i++) {
				System.out.println(ans.get(i));
			}
	}
}


