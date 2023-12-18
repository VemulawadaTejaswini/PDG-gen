import java.util.*;
class Main{
static long i,j,d,t;
static HashSet<Long> L=new HashSet<Long>(),M=new HashSet<Long>(),N=new HashSet<Long>();
public static void main(String[]_){
for(Scanner S=new Scanner(System.in);S.hasNext();L.clear(),M.clear(),N.clear()){
String o=S.next(),s=S.next(),d=S.next();
A(L,s);A(M,d);
if(o.equals("u")){for(long a:L)N.add(a);for(long a:M)N.add(a);}
else{for(long a:L)if(M.contains(a))N.add(a);}
System.out.println(J(1L));
};}
static String J(long a){
if(!N.contains(a))return "";return "("+J(a*2)+","+J(a*2+1)+")";}
static void A(HashSet<Long> a,String s){
d=-1;
for(char c:s.toCharArray()){
t=(long)Math.pow(2,d);
if(c==40)d++;
if(c==44){
for(j=0,i=1;i<t;i*=2){j*=2;if(a.contains(i))j+=1;}
if(a.contains(t+j)||a.contains((t+j+1)/2))a.add(t+j+1);else a.add(t+j);}
if(c==41)d--;
}}}