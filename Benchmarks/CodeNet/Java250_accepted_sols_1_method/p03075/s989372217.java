import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int[] A=new int[5];
	int n=A.length;
	for(int i=0;i<n;i++){
	    A[i]=stdIn.nextInt();
	}     
	int k = stdIn.nextInt();
	String result="Yay!";
	for(int m=0;m<n-1;m++){
	    for(int j=m+1;j<n;j++){
		if(A[j]-A[m]>k){
		    result=":(";
		    break;
		}
	    }
	}
	System.out.println(result);
    }
}
