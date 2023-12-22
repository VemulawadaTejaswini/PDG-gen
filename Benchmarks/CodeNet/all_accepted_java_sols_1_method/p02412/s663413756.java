
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for(;;){
int n=sc.nextInt();
int x =sc.nextInt();
if(n==0 && x==0) break;
int ans =0;
for(int i=1; i<=n; i++){
	for(int c=i+1; c<=n; c++){
		for(int b=c+1; b<=n; b++){
			if(i+c+b == x) ans++;
		}
	}
}
System.out.println(ans);
}
}
}