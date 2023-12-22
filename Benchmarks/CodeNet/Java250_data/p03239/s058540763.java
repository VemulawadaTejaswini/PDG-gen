import java.util.*;
class Main{
  public static void main(String[] a ){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=sc.nextInt();
int ci;
int ti;
int ans=10000;
for(int i=0;i<n;i++){
ci=sc.nextInt();
ti=sc.nextInt();
if(ti<=t){
ans=Math.min(ans,ci);
}}
System.out.println(ans==10000?"TLE":ans);
}}