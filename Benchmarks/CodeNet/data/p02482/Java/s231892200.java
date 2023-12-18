import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
    while(true){
    sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b){
    	System.out.println("a > b");
    }else if(a<b){
    	System.out.println("a < b");
    }else if(a==b){
    	System.out.println("a == b");
    }
    }
	}
}