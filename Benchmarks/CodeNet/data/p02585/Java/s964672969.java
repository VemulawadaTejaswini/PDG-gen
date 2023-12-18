import java.util.*;
import java.io.*;

public class Main{

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s1.length();i++){sb.append(s1.charAt(i));}
    return Integer.parseInt(sb.toString());
}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split("\\s+");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split("\\s+");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
//......................................@uthor_Alx..............................................

public static void main(String[] args) throws  IOException{
                assign();
                int t=1;//read().charAt(0)-'0',cn=1;
                while(t--!=0){
                	int[] x=int_arr();
                	int n=x[0],k=x[1];
                	List<List<Integer>> cycles=new ArrayList<>();
                	int[] p=int_arr();
                	int[] c=int_arr();
                	for(int i=0;i<n;i++){p[i]--;}
                	boolean[] b=new boolean[n];
                    for(int i=0;i<n;i++){
                    	if(b[i]) continue;
                    	List<Integer> tmp=new ArrayList<>();
                    	tmp.add(i);b[i]=true;
                    	int z=p[i];
                    	while(!b[z]){
                    		b[z]=true;
                    		tmp.add(z);
                    		z=p[z];
                    	}
                    	cycles.add(tmp);
                    }
                    long res=Long.MIN_VALUE;
                    for(int i=0;i<cycles.size();i++){
                    	long tmp=Long.MIN_VALUE; int sz=cycles.get(i).size();
                    	long sum=0;
                    	for(int j=0;j<sz;j++){sum+=c[cycles.get(i).get(j)];}
                    	for(int j=0;j<sz;j++){
                    		long tmp1=0;
                    		int f=k/sz,kr=k%sz;
                    		if(f>0&&sum>0) tmp1=(long)f*sum;
                    	    if(f>0&&sum<0){
                    	    	kr=Math.min(k,sz);
                    	    }
                    	    if(k%sz==0&&f>0&&tmp1>0){tmp1-=sum;kr=sz;}
                    		long ss1=0,ss2=Long.MIN_VALUE;
                    		for(int j1=1;j1<=kr;j1++){
                    			ss1+=c[cycles.get(i).get((j+j1)%sz)];
                    			ss2=Math.max(ss2,ss1);
                    		}
                    		 tmp1+=ss2;
                    		 tmp=Math.max(tmp1,tmp);
                    	}

                    	res=Math.max(res,tmp);

                    }
                    for(int xx:c){res=Math.max(res,xx);}
                    out.write(res+"\n");            
                }                
                out.flush();

    }
}