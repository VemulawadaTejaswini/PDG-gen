import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m,k;
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		int ls1[] =  new int[n];
		int ls2[] =  new int[m];
		int book = 0,total = 0,i,j;
		for(i=0;i<n;i++)
			ls1[i] = in.nextInt();
		for(i=0;i<m;i++)
				ls2[i] = in.nextInt();
		i=0;j=0;
		while(true) {
			if((i==n && j==m )||( i<n && total+ls1[i] > k) && (j<m && total+ls2[j]>k))
					break;
			else if((i<n) && j<m &&(ls1[i] < ls2[j]))
			{
				book++;
				total += ls1[i];
				i++;
			}
			else if((i<n) && j<m &&(ls1[i] > ls2[j]))
			{
				book++;
				total += ls2[j];
				j++;
			}
			else if(i==n && j<m && (ls2[j]+total < k))
			{
					total +=ls2[j];
					book++;
			}
			else if(i<n && j==m && (ls1[i]+total < k))
			{
					total +=ls1[i];
					book++;
			}
		}
		System.out.print(book);
	}

}
