import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N =sc.nextInt();
	int [] Number;
	Number=new int[N];
	for(int i=0;i<N;i++){
	    Number[i] =sc.nextInt();
	}
        for(int i=N-1;i>=0;i--){
	    if(i==0) System.out.printf("%d",Number[i]);
	    else System.out.printf("%d ",Number[i]);
   	}
	System.out.println();
    }
}