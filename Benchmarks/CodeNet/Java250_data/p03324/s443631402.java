import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int d = sc.nextInt();
    	int n = sc.nextInt();
    	int reg=1;
    	switch(d){
    	case 0:
    		reg=1;
    		break;
    	case 1:
    		reg=100;
    		break;
    	case 2:
    		reg=10000;
    		break;
    	}
    	if(n==100){
    		n=101;
    	}
    	System.out.println(reg*n);
    }
}