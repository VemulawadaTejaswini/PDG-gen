import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int r = stdIn.nextInt();
	int g = stdIn.nextInt();
	int b = stdIn.nextInt();
	int k = g*10+b;
	if(k%4==0){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
