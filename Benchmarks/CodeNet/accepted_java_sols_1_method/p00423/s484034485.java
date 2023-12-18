import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
for(;;){
int []p=new int[2];
int n=sc.nextInt();
if(n==0)break;
for(;n>0;n--){
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  if(a>b)p[0]+=a+b;
	  else if(a<b)p[1]+=a+b;
	  else for(int i=0;i<2;i++)p[i]+=a;
  }
System.out.println(p[0]+" "+p[1]);
  }
}
   }