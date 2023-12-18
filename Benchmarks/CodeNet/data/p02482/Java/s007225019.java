import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	//Scan data from input
	Scanner sc = new Scanner(System.in);
	//Imput two number as Real number;
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<b){
	System.out.println("a<b");
	}else if(a>b){
	System.out.println("a>b");
	}else{
	System.out.println("a=b");
	}
	}
}