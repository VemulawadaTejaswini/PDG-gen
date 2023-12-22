import java.util.Scanner;

public class Main{
    public static void main(String argv[]){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int i,count=0;
	for( i = b ; i >= a ;i-- )
	    {
		if( c % i == 0 )
		    count++;
	    }
	System.out.println(count);
    }
}
	