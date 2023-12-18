import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String p=s.nextLine();
			if(p.equals("0"))System.exit(0);
			String []q=p.split(" ");
			int r[]=new int[q.length];
			for(int j=0;j<q.length;j++){
				r[j]=Integer.parseInt(q[j]);
			}
			int one=0;
			int point=0;
			for(int j=0;j<q.length;j++){
				if(r[j]==1)one++;
				else if(r[j]>10)point+=10;
				else point+=r[j];
			}
			point+=one;
			while(one>0&&point+10<=21){
				one--;
				point+=10;
			}
			if(point>21)System.out.println(0);
			else System.out.println(point);
		}
	}
}