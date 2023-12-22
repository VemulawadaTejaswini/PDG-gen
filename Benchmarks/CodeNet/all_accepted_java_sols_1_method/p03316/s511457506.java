import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
int n=Integer.parseInt(s);
char c[]=s.toCharArray();
int fn=0;
for(int i=0;i<c.length;i++){
	String k=String.valueOf(c[i]);
	fn+=Integer.parseInt(k);
}

if(n%fn==0){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}}