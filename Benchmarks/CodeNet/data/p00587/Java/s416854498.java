import java.util.*;
class Main{
static int i,p,d,t;
static HashSet<Integer> L=new HashSet<Integer>(),M=new HashSet<Integer>(),N=new HashSet<Integer>();
public static void main(String[]_){
for(Scanner S=new Scanner(System.in);S.hasNext();L.clear(),M.clear(),N.clear()){
String o=S.next(),s=S.next(),d=S.next();
A(L,s);A(M,d);
if(o.equals("u")){for(int a:L)N.add(a);for(int a:M)N.add(a);}
else{for(int a:L)if(M.contains(a))N.add(a);}
System.out.println(J(1));
};}
static String J(int a){
if(!N.contains(a))return "";return "("+J(a*2)+","+J(a*2+1)+")";}
static void A(HashSet<Integer> a,String s){
d=-1;
for(char c:s.toCharArray()){
t=(int)Math.pow(2,d);
if(c==40)d++;
if(c==44){if(a.contains(t)||a.contains(t/2))a.add(t+1);else a.add(t);}
if(c==41)d--;
}}}