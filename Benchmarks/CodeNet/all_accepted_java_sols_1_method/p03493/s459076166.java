import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int a = stdIn.nextInt();
	int k=a;
	int count=0;
	for(int i=0;i<3;i++){
	    k=a%10;
	    if(k==1){
		count++;
	    }
	    a/=10;
	}
	System.out.println(count);
    }
}
