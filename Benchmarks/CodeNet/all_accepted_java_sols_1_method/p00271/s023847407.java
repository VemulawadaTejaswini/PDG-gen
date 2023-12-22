import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a ,b;
	for(int i=0;i<7;i++){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println(a-b);
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}