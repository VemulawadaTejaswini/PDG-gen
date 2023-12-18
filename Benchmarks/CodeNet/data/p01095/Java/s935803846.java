import java.util.*;
public class Main {
static Scanner inp=new Scanner(System.in);
	public static void main(String args[]) {
		int n=inp.nextInt();
		int m=inp.nextInt();
		int mrk[]=new int[10000000];
		for (int i=1;i<=7368791;i++)mrk[i]=1;
		for (int i=2;i<=7368791;i++)
			if (mrk[i]==1)
				for(int j=i;j<=7368791/i;j++)
					if (mrk[i*j]==1)mrk[i*j]=j;
		while (n>0){
			for (int i=n;i<=10000000;i++)
				if (mrk[i]<n){m--;if(m==-1){System.out.println(i);break;}}
			n=inp.nextInt();
			m=inp.nextInt();
		}
	}

}