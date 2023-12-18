import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	int count=0;
	for(int i=1;i<a+1;i++){
	    if(i==a&&b<a){
		break;
	    }
	    count++;
	}
	System.out.println(count);
    }
}
