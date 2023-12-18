
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public void run() {
    	Case:while(true){
        	int p=sc.nextInt(),q=sc.nextInt(),
        			a=sc.nextInt(),n=sc.nextInt();
            if(p==0 && q==0)return;

            int res=0;

            if(n--==0){
            	ln(res);continue;
            }
            for(int a1=1;a1<=a;a1++){
            	if(p*a1==q)res++;
            }
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++){
    				int v=a1*a2;
            		if(p*v==q*(v/a1+v/a2))res++;
    			}
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++)
            		for(int a3=a2;a1*a2*a3<=a;a3++){
        				int v=a1*a2*a3;
                		if(p*v==q*(v/a1+v/a2+v/a3))res++;
        			}
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++)
            		for(int a3=a2;a1*a2*a3<=a;a3++)
            			for(int a4=a3;a1*a2*a3*a4<=a;a4++){
            				int v=a1*a2*a3*a4;
                    		if(p*v==q*(v/a1+v/a2+v/a3+v/a4))res++;
            			}
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++)
            		for(int a3=a2;a1*a2*a3<=a;a3++)
            			for(int a4=a3;a1*a2*a3*a4<=a;a4++)
            				for(int a5=a4;a1*a2*a3*a4*a5<=a;a5++){
                				int v=a1*a2*a3*a4*a5;
                        		if(p*v==q*(v/a1+v/a2+v/a3+v/a4+v/a5))res++;
                			}
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++)
            		for(int a3=a2;a1*a2*a3<=a;a3++)
            			for(int a4=a3;a1*a2*a3*a4<=a;a4++)
            				for(int a5=a4;a1*a2*a3*a4*a5<=a;a5++)
                				for(int a6=a5;a1*a2*a3*a4*a5*a6<=a;a6++){
                    				int v=a1*a2*a3*a4*a5*a6;
                            		if(p*v==q*(v/a1+v/a2+v/a3+v/a4+v/a5+v/a6))res++;
                    			}
            if(n--==0){
            	ln(res);continue;
            }

            for(int a1=1;a1<=a;a1++)
            	for(int a2=a1;a1*a2<=a;a2++)
            		for(int a3=a2;a1*a2*a3<=a;a3++)
            			for(int a4=a3;a1*a2*a3*a4<=a;a4++)
            				for(int a5=a4;a1*a2*a3*a4*a5<=a;a5++)
                				for(int a6=a5;a1*a2*a3*a4*a5*a6<=a;a6++)
                    				for(int a7=a6;a1*a2*a3*a4*a5*a6*a7<=a;a7++){
                    				int v=a1*a2*a3*a4*a5*a6*a7;
                            		if(p*v==q*(v/a1+v/a2+v/a3+v/a4+v/a5+v/a6+v/a7))res++;
                    			}
            if(n--==0){
            	ln(res);continue;
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }


	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(Boolean o){
		return o?"YES":"NO";
	}
//	static String str(Double o){
//		return String.format("%.8f",o);
//	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}

	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return str((Boolean)o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
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