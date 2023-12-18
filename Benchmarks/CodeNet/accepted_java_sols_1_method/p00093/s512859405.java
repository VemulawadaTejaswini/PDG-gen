import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a=0,b=0;
	boolean na = true,first = true;

	while(sc.hasNext()){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(a==0 && b==0) break;

	    if(!first) System.out.println();
	    na = true;

	    for(int i = a;i<=b;i++){
		if(i%4==0){
		    if(i%100==0){
			if(i%400==0){ System.out.println(i); na = false; }
		    }else{ System.out.println(i); na = false; }
		}
	    }

	    if(na) System.out.println("NA");
	    first = false;
	}
    }
}