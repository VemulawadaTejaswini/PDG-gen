import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
long a=scan.nextInt();
long b=1;
long i=1;
do {

b=b%1000000007;
	if(i==a+1) {break;}
	b=b*i;
	i++;
}while(true);
System.out.println(b);
}
}