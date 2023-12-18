import java.util.*;
class Main{
  public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double t=sc.nextDouble();
double a=sc.nextDouble();
int ans=0;
double min=Integer.MAX_VALUE;double tmp;
for(int i=0;i<n;i++){
tmp=sc.nextDouble();
if(min>  Math.abs(a-t+tmp*0.006)){
min= Math.abs(a-t+tmp*0.006);
ans=i;
}


}System.out.println(ans+1);}}