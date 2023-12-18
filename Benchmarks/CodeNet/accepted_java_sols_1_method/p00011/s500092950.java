import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<String> shuff= new ArrayList<String>();
		int w,n,tmp;
		int shuf_num[] =new int[2];
		String buf[]=new String[2];
		w=in.nextInt();
		n=in.nextInt();
		int a[]=new int[w];
		for (int i=0;i<w;i++) {
			a[i] = i+1;
		}
		for(int i=0;i<n;i++){
			buf =(in.next()).split(",",0);
			shuf_num[0]=Integer.parseInt(buf[0])-1;
			shuf_num[1]=Integer.parseInt(buf[1])-1;
			tmp=a[shuf_num[0]];
			a[shuf_num[0]]=a[shuf_num[1]];
			a[shuf_num[1]]=tmp;
		}
		for (int i=0;i<w;i++) {
				System.out.printf("%d%n",a[i]);
		}
	}
}