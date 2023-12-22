import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());

	int a ;
	String result = "APPROVED";

	for (int i=0;result.equals("APPROVED") && i < N;i++){

	    a = Integer.parseInt(sc.next());

	    if(a%2 == 0){
		if(a%3 == 0 || a%5 == 0){
		}else {
		    result = "DENIED";
		}
	    }
		   
	}
	System.out.println(result);
    }
}
