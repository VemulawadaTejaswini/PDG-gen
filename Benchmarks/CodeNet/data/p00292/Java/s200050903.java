import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ans=0;
        int n=sc.nextInt();
for(;n>=0;n--){
	int k=sc.nextInt(); int p=sc.nextInt();
  if(k>p){
	  if(k%p==0)ans=p; else ans=k%p;
  }else ans=k;
	  
System.out.println(ans);
}
}
}