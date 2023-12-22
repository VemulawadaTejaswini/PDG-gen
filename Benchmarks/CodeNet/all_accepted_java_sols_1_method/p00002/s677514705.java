import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    int a = sc.nextInt();
	    int b = sc.nextInt();

	    String sum = Integer.toString(a+b);

	    System.out.println(sum.length());
	}
    }
}