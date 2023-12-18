import java.util.Scanner;

public class Main {

	static int y1,m1,d1,y2,m2,d2;
	static int[] years, month;
	static{
		years = new int[10000];
		for(int i = 0;i<10000;i++){
			if(i%400==0){
				years[i]=366;
			}
			else if(i%100==0){
				years[i]=365;
			}
			else if(i%4==0){
				years[i]=366;
			}
			else{
				years[i]=365;
			}
		}
		month=new int[13];
		for(int i = 1;i<=7;i++){
			if(i%2==0){
				if(i==2){
					month[i]=28;
				}
				else{
					month[i]=30;
				}
			}
			else{
				month[i]=31;
			}
		}
		for(int i= 8;i<13;i++){
			if(i%2==0){
				month[i]=31;
			}
			else{
				month[i]=30;
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			y1=cin.nextInt();
			m1=cin.nextInt();
			d1=cin.nextInt();
			y2=cin.nextInt();
			m2=cin.nextInt();
			d2=cin.nextInt();
			if(y1<0||m1<0||d1<0||y2<0||m2<0||d2<0){
				break;
			}
			if(y1>y2){
				swap();
			}
			else if(y1==y2){
				if(m1>m2){
					swap();
				}
				else if(m1==m2){
					if(d1>d2){
						swap();
					}
					else if(d1==d2){
						System.out.println(0);
						continue;
					}
				}
			}


			int ans=0;
			for(int i = y1+1;i<y2;i++){
				ans+= years[i];
			}
			if(y1!=y2){
				for(int i = m1+1;i<13;i++){
					if(i==2&&years[y1]==366){
						ans+=29;
					}
					else{
						ans+=month[i];
					}
				}
				for(int i = 1;i<m2;i++){
					if(i==2&&years[y2]==366){
						ans+=29;
					}
					else{
						ans+=month[i];
					}
				}
			}
			else if(y1==y2){
				for(int i = m1+1;i<m2;i++){
					if(i==2&&years[y2]==366){
						ans+=29;
					}
					else{
						ans+=month[i];
					}
				}
			}
			if(m1==m2&&y1==y2){
				ans+= d2-d1;
			}
			else{
				if(m1!=2){
					ans += month[m1]-d1;
				}
				else if(m1==2&&years[m1]==366){
					ans += 29-d1;
				}
				ans += m2;
			}
			System.out.println(ans);
		}
	}
	static void swap(){
		int tmp = y1;
		y1=y2;
		y2=tmp;

		tmp = m1;
		m1=m2;
		m2=tmp;

		tmp=d1;
		d1=d2;
		d2=tmp;
	}
}