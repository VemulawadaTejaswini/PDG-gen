import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int a, b, d=0;
	boolean check = false;

	while(in.hasNext()){
	    
	    a = in.nextInt();
	    b = in.nextInt();

	    if(a == 0 && b == 0) break;
	    if(d!=0) System.out.println();

	    check = false;

	    while(a>0 && a<=b){
		if(a%4 == 0){
		    if(a%100 == 0){
			if(a%400 == 0){
			    System.out.println(a);
			    check = true;
			}
		    }else{ System.out.println(a); check = true; }
		}
		a++;
	    }

	    if(check == false) System.out.println("NA");
	    d++;

	}
    }
}