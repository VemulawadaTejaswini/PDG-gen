import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int c=0;
int[] d=new int[5]; 
for(int i=a;i<=b;i++){
d[0]=i-i/10*10;
d[1]=(i/10*10-i/100*100)/10;
d[2]=(i/100*100-i/1000*1000)/100;
d[3]=(i/1000*1000-i/10000*10000)/1000;
d[4]=i/10000;
if(i==d[0]*10000+d[1]*1000+d[2]*100+d[3]*10+d[4]){c++;}
}
System.out.println(c);
}}