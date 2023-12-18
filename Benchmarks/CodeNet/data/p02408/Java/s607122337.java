import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			boolean []s=new boolean[13];
			boolean []h=new boolean[13];
			boolean []c=new boolean[13];
			boolean []d=new boolean[13];
			
			int x;
			
			
			for(int a=0;a<n;++a){
				String b = sc.next();
				if(b.equals("S")){
					x=sc.nextInt();
					s[x-1]=true;
				}else if(b.equals("H")){
					x=sc.nextInt();
					h[x-1]=true;
				}else if(b.equals("C")){
					x=sc.nextInt();
					c[x-1]=true;
				}else if(b.equals("D")){
					x=sc.nextInt();
					d[x-1]=true;
				}
			}
			for(int a=1;a<=13;++a){
				if(s[a-1]!=true){
					System.out.println("S "+a);
				}
			}
			for(int a=1;a<=13;++a){
				if(h[a-1]!=true){
					System.out.println("H "+a);
				}
			}
			for(int a=1;a<=13;++a){
				if(c[a-1]!=true){
					System.out.println("C "+a);
				}
			}
			for(int a=1;a<=13;++a){
				if(d[a-1]!=true){
					System.out.println("D "+a);
				}
			}
	}

}