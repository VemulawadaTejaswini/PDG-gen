import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
for(int i=0;i<3;i++){
	if(c[i]=='1'){
		c[i]='9';
	}else{
		c[i]='1';
	}
}
for(int i=0;i<=2;i++){
	System.out.print(c[i]);
}
System.out.println();
	}
}