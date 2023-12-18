

import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    class Cake{
    	int d,w;

    	public Cake(int w,int d){
    		this.d=d;this.w=w;
    	}
    	public int getS(){
    		return d*w;
    	}

    	public String toString(){
    		return ""+getS();
    	}
    }
    public void run() {
        while(true){
            int n=sc.nextInt(),w=sc.nextInt(),d=sc.nextInt();
            if(n==0 && w==0 && d==0)return;
            ArrayList<Cake> list=new ArrayList<>();
            list.add(new Cake(w,d));

            for(int q=0;q<n;q++){
            	int p=sc.nextInt();
            	Cake c=list.get(p-1);
            	int s=sc.nextInt();
            	Cake c1=null,c2=null;
            	s%=(c.w+c.d);
            	if(s<c.w){
            		c1=new Cake(s,c.d);
            		c2=new Cake(c.w-s,c.d);
            	}else{
                	s-=c.w;
            		c1=new Cake(c.w,s);
            		c2=new Cake(c.w,c.d-s);
            	}
            	list.remove(p-1);

            	if(c1.getS()<c2.getS()){
        			list.add(c1);list.add(c2);
        		}else{
        			list.add(c2);list.add(c1);
        		}
            }
            Collections.sort(list,new Comparator<Cake>(){
            	@Override
            	public int compare(Cake o1, Cake o2) {
            		return o1.getS()-o2.getS();
            	}
			});

            for(int i=0;i<list.size();i++){
            	if(i>0)pr(" ");
            	pr(list.get(i).getS());
            }
            ln();
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }

	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object... obj){
		out.print(str(obj));
	}
	public static void ln(Object... obj){
		for(Object o:obj){
			pr(o);ln();
		}
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}
}