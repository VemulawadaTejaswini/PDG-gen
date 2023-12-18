import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int s=n;
			int count=0;
			int ma=0,mb=0,mc=0;
			if(n>9)	ma=9;
			else	ma=n;
			for(int a=ma;a>=0;a--){
				int sa=s-a;
				if(sa>9)	mb=9;
				else		mb=sa;
				for(int b=mb;b>=0;b--){
					int sb=sa-b;
					if(sb>9)	mc=9;
					else		mc=sb;
					for(int c=mc;c>=0;c--){
						int sd=sb-c;
						if(sd>=0&&sd<10){
							count++;
							//System.out.printf("%d %d %d %d\n",a,b,c,sd);
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}