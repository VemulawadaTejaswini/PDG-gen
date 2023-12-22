import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		while(true){
			String a=s.next();
			String b=s.next();
			if(a.length()==1)System.exit(0);
			int hit=0;
			for(int i=0;i<4;i++)if(a.charAt(i)==b.charAt(i))hit++;
			int blow=0;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					if(a.charAt(i)==b.charAt(j)&&i!=j)blow++;
			System.out.println(hit+" "+blow);
		}
	}
}