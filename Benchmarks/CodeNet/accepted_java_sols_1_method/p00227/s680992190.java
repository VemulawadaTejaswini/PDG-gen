import java.util.*;

public class Main{
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
 for(;;){
 int n=sc.nextInt(),m=sc.nextInt();
 if(m==0)break;
 int ans=0;
 int []in=new int[n];
 int []bezi=new int[n+1];
 for(int i=0; i<n;i++)in[i]=sc.nextInt();
 Arrays.sort(in);
 for(int i=n-1;i>=0;i--)bezi[n-i]=in[i];
 for(int i=1;i<=n;i++){
	 ans+=bezi[i];
	 if(i%m==0)ans-=bezi[i];
 }
 System.out.println(ans);
   }
 }
}