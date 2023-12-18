import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt();
			int b=s.nextInt();
			String atari[]=new String[a];
			int earn[]=new int[a];
			if(a+b==0)System.exit(0);
			for(int i=0;i<a;i++){
				atari[i]=s.next();
				earn[i]=s.nextInt();
			}
			int ret=0;
			for(int i=0;i<b;i++){
				String now=s.next();
				for(int j=0;j<a;j++){
					boolean ok=true;
					for(int k=0;k<8;k++)
						if(atari[j].charAt(k)!='*'&&atari[j].charAt(k)!=now.charAt(k))ok=false;
					if(ok)ret+=earn[j];
				}
			}
			System.out.println(ret);
		}
	}
}