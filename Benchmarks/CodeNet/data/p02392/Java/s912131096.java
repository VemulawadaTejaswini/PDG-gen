import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner;
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b<c) System.out.println("Yes");
	else System.out.println("No");
    }

}