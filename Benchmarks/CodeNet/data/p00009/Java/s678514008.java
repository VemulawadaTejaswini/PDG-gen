import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x;
	System.out.println("2");
        for(x=3;x<=n;x++){
	    for(int i=2;i<x;i++){
		if(x%i==0)
		    break;
		else if(i==(x-1))
		    System.out.println(x);
	    }
	}
    }
}