import java.util.*;
class Main{
static int i,p,d,t,m;
static boolean[] L,M,N;
public static void main(String[]_){
for(Scanner S=new Scanner(System.in);S.hasNext();){
String o=S.next(),s=S.next(),d=S.next();
L=new boolean[(int)Math.pow(2,s.length()-1)+2];
M=new boolean[(int)Math.pow(2,d.length()-1)+2];
A(L,s);
A(M,d);
m=Math.min(s.length(),d.length())+2;
N=new boolean[(int)Math.pow(2,m-1)];
if(o.equals("u")){for(i=0;i<m;i++)if(L[i]||M[i])N[i]=true;}
else{for(i=0;i<m;i++)if(L[i]&&M[i])N[i]=true;}
System.out.println(J(1));
};
}
static String J(int a){
if(!N[a])return "";
return "("+J(a*2)+","+J(a*2+1)+")";
}
static void A(boolean[]a,String s){
d=-1;
for(char c:s.toCharArray()){
t=(int)Math.pow(2,d);
if(c==40)d++;
if(c==44){if(a[t]||a[t/2])a[t+1]=true;else a[t]=true;}
if(c==41)d--;
}
}
}