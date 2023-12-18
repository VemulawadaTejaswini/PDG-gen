import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
	int A = stdIn.nextInt();
	int count=0;
	do{
	    H-=A;
	    count++;
	}while(H>0);
	System.out.println(count);
    }
}
