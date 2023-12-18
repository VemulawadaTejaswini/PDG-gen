import java.util.Scanner;


public class Main {

	final int DAY_MONTH[]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30 ,31};
	
	Scanner sc;
	
	int isLeap(int y){
		if(y%4==0){
			if(y%100==0){
				if(y%400==0){
					return 1;
				}
				else{
					return 0;
				}
			}
			else{
				return 1;
			}
		}
		else{
			return 0;
		}
	}
	
	int dayCount(int y, int m1, int d1, int m2, int d2){
		int days=-d1;
		for(int m=m1;m<=m2;++m){
			days+=DAY_MONTH[m];
			if(m==2) days+=isLeap(y);
		}
		days-=DAY_MONTH[m2]+(m2==2?isLeap(y):0)-d2;
		return days;
	}
	
	int solve(int y1, int m1, int d1, int y2, int m2, int d2){
		int days=0;
		if(y2-y1>=2){
			for(int y=y1+1;y<y2;++y){
				days+=365+isLeap(y);
			}
		}
		if(y2-y1>=1){
			days+=dayCount(y1, m1, d1, 12, 31)+dayCount(y2, 1, 1, m2, d2)+1;
		}
		else{
			days=dayCount(y1, m1, d1, m2, d2);
		}
		return days;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		while(true){
			int y1=ni(), m1=ni(), d1=ni(), y2=ni(), m2=ni(), d2=ni();
			if(y1<0||m1<0||d1<0||y2<0||m2<0||d2<0) break;
			
			System.out.println(solve(y1, m1, d1, y2, m2, d2));
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}