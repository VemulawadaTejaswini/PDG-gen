import java.util.*;
import java.io.*;
public class Main{
/// functions
static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}
static long Modpow(long a,long p,long m){if(p==1){return a;}long x=Modpow(a,p/2,m);x=(x*x)%m;return (p&1l)!=0? (x*a)%m:x;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
// end
static long[] f;

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
       StringBuilder sb1=new StringBuilder();
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt(),m=s.nextInt();
       for(int i=0;i<m;i++){sb.append(n);}
       	for(int i=0;i<n;i++){sb1.append(m);}
         String s1=sb.toString();
         String s2=sb1.toString();
         s1=s1.compareTo(s2)>0?s2:s1;
        out.write(s1+"");
       out.flush();

      /* long res=0;
       String m=Integer.toString(n);
       int k=m.length();
       for(int i=11;i<=n;i++){
       	if(i%10==0){continue;}
       	String ss=Integer.toString(i);
       	int l=ss.length();
       	long tmp=0;
       	if((ss.charAt(l-1)-'0'<=m.charAt(0)-'0')&&(ss.charAt(0)-'0'<=m.charAt(k-1)-'0')){
       		 tmp++;
       		 long tmp1=0;
       		 if((ss.charAt(l-1)==ss.charAt(0))&&l>1){tmp1++;}
       		for(int j=1;j<k-1;j++){
       			int xx=m.charAt(j)-'0';
       			tmp=(long)tmp*xx;
       		}
       		 tmp+=tmp1;
       		res+=tmp;
       	}
       	//out.write(i+" "+tmp+"\n");
       }
       res+=Math.min(9,n);
       for(int i=1;i<=Math.min(9,n);i++){
       		String ss=Integer.toString(i);
       	int l=ss.length();
       	long tmp=0;
       	if((ss.charAt(l-1)-'0'<=m.charAt(0)-'0')&&(ss.charAt(0)-'0'<=m.charAt(k-1)-'0')){
       		tmp++;
              for(int j=1;j<k-1;j++){
       			int xx=m.charAt(j)-'0';
       			tmp=(long)tmp*xx;
       		}
       	}
       	   res+=tmp;
       }
       out.write(res+"");
        out.flush();*/
  }
}
