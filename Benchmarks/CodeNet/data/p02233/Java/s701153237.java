import java.util.Scanner;
public class Main {
 static int[] hai;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
   Scanner sca=new Scanner(System.in);
      hai=new int[sca.nextInt()+1];
      for(i=0;i<hai.length;i++)hai[i]=-1;
      System.out.println(fib(hai.length-1));
	}
	public static int fib(int n){
		if(n==0||n==1)return 1;
		if(hai[n]!=-1)return hai[n];
		hai[n]=fib(n-1)+fib(n-2);
		return hai[n];
	}

}

