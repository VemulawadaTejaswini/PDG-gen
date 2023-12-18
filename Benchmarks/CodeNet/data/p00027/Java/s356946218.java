import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt(),b=s.nextInt();
			if(a==0&&b==0)System.exit(0);
			int day=b;
			switch(a){
				case 12:day+=30;
				case 11:day+=31;
				case 10:day+=30;
				case 9: day+=31;
				case 8: day+=31;
				case 7: day+=30;
				case 6: day+=31;
				case 5: day+=30;
				case 4: day+=31;
				case 3: day+=29;
				case 2: day+=31;
			}
			String [] ans={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
			System.out.println(ans[day%7]);
		}
	}
}