import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt(),n=sc.nextInt();//入力
		int[] high=new int[day];
		for(int i=0;i<day;i++){
			high[i]=sc.nextInt();
		}
		int[] ht=new int[n];
		int[] lt=new int[n];
		int[] loud=new int[n];
		for(int i=0;i<n;i++){
			lt[i]=sc.nextInt();ht[i]=sc.nextInt();loud[i]=sc.nextInt();
		}//入力
		
		int[][] c=new int[day][n];
		for(int i=0;i<day;i++){
			for(int j=0;j<n;j++){
				if(lt[j]<=high[i]&&high[i]<=ht[j])
					c[i][j]=loud[j];
			}
		}
		int[] l=new int[day];
		int[] ans=new int [day];
		for(int h=0;h<day-1;h++){
			for(int i=0;i<day;i++){
				for(int j=0;j<n;j++){
					if(i!=0&&Math.abs(c[i][j]-c[i-1][j])>l[i])
						l[i]=c[i][j]-c[i-1][j];
				}
				ans[i]+=l[i];
			}
		}
		int a=0;
		for(int i=0;i<ans.length;i++){
			a=Math.max(a,ans[i]);
		}
		System.out.println(a-100);
	}
}