import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
while(sc.hasNext()){
int n=sc.nextInt();
int ans=0;
if(n>1)ans++;
for(int j=n; j>2;j--){
boolean b=true;
for(int i=2; i<j;i++){
	if(j%i==0){
		b=false;break;
	}
}
if(b==true) ans++;
}
System.out.println(ans);
}	
}
}