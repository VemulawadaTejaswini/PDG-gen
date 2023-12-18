import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int a=stdIn.nextInt();
	int b=stdIn.nextInt();
	int c=stdIn.nextInt();
	int i=b-a;
	int j=c-b;
	if(i==j){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
	
