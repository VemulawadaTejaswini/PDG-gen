import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	private static void quicksort(card a[],int start,int end){
		int i=start,j=end,pivot=a[(i+j)/2].num;
		if (start>=end){return;}
		for (;i<=j;){
			for (;a[i].num<pivot;i++){};
			for (;a[j].num>pivot;j--){};
			if (i<=j){
				card tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
				i++;
				j--;
			}
		}
		quicksort(a,start,j);
		quicksort(a,i,end);
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.parseInt(br.readLine());
		card a[]=new card[n];
		for (int i=0;i<n;i++){
			String[] str=br.readLine().split(" ");
			a[i]=new card(str[0],Integer.parseInt(str[1]),i);
		}
		quicksort(a,0,n-1);
		String message="Stable";
		for (int i=0;i<n-1;i++){
			if(a[i].num==a[i+1].num && a[i].index>a[i+1].index){
				message="Not stable";
				break;
			}
		}
		pw.println(message);
		for (int i=0;i<n;i++){pw.println(a[i].suit+" "+a[i].num);};
		pw.close();
	}
}
class card{
	String suit;
	int num,index;
	public card(String s,int n,int i){
		this.suit=s;
		this.num=n;
		this.index=i;
	}
}