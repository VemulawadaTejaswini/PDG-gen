import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long x=sc.nextLong();
boolean loop=true;
long i=1;
long now=0;
while(loop){
	now+=i;
i++;

	if(now>=x){
		loop=false;
	}
}
i--;
System.out.println(i);

	}}