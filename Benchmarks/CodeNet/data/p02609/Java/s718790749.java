import java.util.*;
public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=sc.next();

long x=Integer.parseInt(s,2);
int temp=n;

while(n-->0) {

int ans=0;
long c=(x^(1<<n));


while(c>0) {
	ans++;
	int count=0;


for(int i=0;i<temp;i++) {
	
	if((c&(1<<i))!=0) {
		
		count++;
	}
}    



c=c%count;


}
System.out.println(ans);

	}

}

}

