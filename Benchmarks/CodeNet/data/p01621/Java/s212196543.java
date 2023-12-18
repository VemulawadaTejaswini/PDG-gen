import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.*;

public class B {
	
	
	void run(){
		while(true){
			int s=sc.nextInt(),n=sc.nextInt(), t = sc.nextInt();
			String week = sc.next(), time = sc.next();
			int p = sc.nextInt(), m = sc.nextInt();
			if(s==0 && n==0 && t == 0)return;
			
			int count = 0;
			int w = 60*24*7;
			if (week.equals("All") && time.equals("All")){
				count = m;
			} else {

				if (!week.equals("All")) {
					int b;
					if (time.equals("All") || time.equals("Day")) {
						if (time.equals("All")) b = 1440;
						else b = 720;
						for (int begin = 0; begin < w; begin++) {
							int c = 0;
							for (int i = 0; i < m; i++) {
								if ((begin +i*t)%w <= b && (begin +i*t+s)%w < b) {
									c++;
								}
							}
							count = Math.max(count, c);
						}
					} else {
						b = 360;
						for (int begin = 0; begin < w; begin++) {
							int c = 0;
							for (int i = 0; i < m; i++) {
								if (((begin +i*t)%w <= b && (begin +i*t+s)%w < b) || (1080 <=(begin +i*t)%w && (begin +i*t)%w < b+1080 && (begin +i*t+s)%w < b+1080 && 1080 < (begin +i*t+s)%w)) {
									c++;
								}
							}
							count = Math.max(count, c);
						}
					}
				} else {
					int b;
					if (time.equals("All")) b = 1440;
					else b = 720;
					for (int begin = 0; begin < w; begin++) {
						int c = 0;
						for (int i = 0; i < m; i++) {
							boolean flag = false;
							for (int j = 0; j < 7; j++) {
								if (1440*j <= (begin +i*t)%w && (begin +i*t)%w < b+1440*j &&
										1440*j <= (begin +i*t+s)%w && (begin +i*t+s)%w < b+1440*j) {
									flag = true;
									break;
								}
							}
							if (flag)
								c++;
						}
						count = Math.max(count, c);
					}
				}
			}
			
			out.printf("%.10f\n", 1.0-Math.pow((double)(p-1)/p, n*count));
		}
	}
	
	public static void main(String[]_){
		new B().run();
		out.flush();
		out.close();

		err.println("end");
	}
	
	static Scanner sc=new Scanner(in);

	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	
	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return "";
		return o.toString();
	}
	
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0)return 0;
		return 1+_getArrayDepth(Array.get(o,0));
	}
	
	static String _strArray(Object o,int depth){
		if(depth==0)return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth-1));
		}	
		return sb.toString();
	}
	
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}