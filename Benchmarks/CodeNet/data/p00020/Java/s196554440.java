import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	String a = new String(sc.next());
        	if(sc.hasNext()){
        		System.out.print(a.toUpperCase());
        		System.out.print(" ");
        	}else{
        		System.out.println(a.toUpperCase());
        	}
    	}
    }
}