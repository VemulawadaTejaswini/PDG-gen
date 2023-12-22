import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int n = stdIn.nextInt();
	int j;
	int[] result=new int[3];
	int i=2;
	while(n!=0){
	    j = n%10;
	    if(j==9){
		result[i]=1;
	    }else if(j==1){
		result[i]=9;
	    }else{
		result[i]=j;
	    }
	    n/=10;
	    i--;
	}
	System.out.print(result[0]);
	System.out.print(result[1]);
	System.out.println(result[2]);
    }
}
	
