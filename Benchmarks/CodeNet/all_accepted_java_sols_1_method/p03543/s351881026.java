import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int[] n=new int[4];
	String result="No";
	for(int i=3;i>=0;i--){
	    n[i]=N%10;
	    N/=10;
	}
	if(n[3]==n[2]&&n[3]==n[1]){
	    result="Yes";
	}
	if(n[2]==n[1]&&n[2]==n[0]){
	    result="Yes";
	}
	System.out.println(result);
    }
}
