import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		long sum=0;
		for(int i=1;i<=n;i++){
			if(i%3!=0 &&i%5!=0){
				sum+=i;
			}
		}
      System.out.println(sum);
	}

}