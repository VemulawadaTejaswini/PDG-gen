import java.util.*;
class Main {
	static String findMultiple(int N){
      	long sum=0;
    	while(N>0) {
      		sum=sum+(N%10);
      		N=N/10;
      	}
      	if(sum%9==0)
          return "Yes";
      	return "No";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	System.out.println(findMultiple(N));
	}

}
