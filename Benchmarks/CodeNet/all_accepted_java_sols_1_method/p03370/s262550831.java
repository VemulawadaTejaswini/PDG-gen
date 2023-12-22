import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int x=sc.nextInt();
int[] m=new int[n];
int sum=0,min=0;
for(int i=0;i<n;i++){
m[i]=sc.nextInt();
if(i==0){min=m[i];}else{min=Math.min(m[i],min);}
sum+=m[i];
}
int xx=x-sum;

System.out.println(n+xx/min);
}}