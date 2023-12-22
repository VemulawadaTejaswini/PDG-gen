import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	long h = Long.parseLong(stdIn.next());
	int n = stdIn.nextInt();
	int sum=0;
	int[] a=new int[n];
	String result="No";
	for(int j=0;j<n;j++){
	    a[j]=stdIn.nextInt();
	    sum+=a[j];
	    if(sum>=h){
		result = "Yes";
		break;
	    }
	}
	System.out.println(result);
    }
}
	
