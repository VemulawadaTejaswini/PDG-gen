import java.util.Scanner;
public class Main{
    public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=c-b;
	int e=b-a;

	if(d>0 && e>0){
	    System.out.println( "Yes" );
	}else{
	    System.out.println("No");
	}
		
    }

}