import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
//int b=scan.nextInt();
//int c=scan.nextInt();
int ans=0;
if(a==7||a==5||a==3) {
 ans=1;
}
if(ans==1) {
System.out.println("YES");
}
else {
	
	System.out.println("NO");
}
}
}
