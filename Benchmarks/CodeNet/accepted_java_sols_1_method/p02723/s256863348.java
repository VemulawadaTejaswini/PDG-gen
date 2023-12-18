import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String sc = stdIn.next();
	if(sc.charAt(2)==sc.charAt(3)&&sc.charAt(4)==sc.charAt(5)){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
