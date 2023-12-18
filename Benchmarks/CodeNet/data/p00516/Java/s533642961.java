import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0593().doIt();
	}
	
	class AOJ0593{
		void doIt(){
			int n = in.nextInt();//競技
			int b = in.nextInt();//審査員
			Kyougi[] kyougi = new Kyougi[n];
			for(int i=0;i<n;i++)kyougi[i] = new Kyougi(i+1, in.nextInt());
			for(int s=0;s<b;s++){
				int a = in.nextInt();
				for(int i=0;i<n;i++)if(a>=kyougi[i].num){
					kyougi[i].cnt++;
					break;
				}
			}
			int max,result;
			max = result = Integer.MIN_VALUE;
			
			for(int i=0;i<n;i++)if(max<kyougi[i].cnt){
				max = kyougi[i].cnt;
				result = kyougi[i].ban;
			}
			System.out.println(result);
		}
		class Kyougi{
			int ban,cnt,num;
			public Kyougi(int ban,int num){
				this.ban = ban;
				this.num = num;
				cnt = 0;
			}
			public String toString(){
				return this.ban+" "+this.cnt+" "+this.num;
			}
		}
	}
	
}