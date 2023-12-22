import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int Debt=100000;
		for(int i=0;i<N;i++){
			Debt=Debt*105/100;
			if(Debt%1000!=0)Debt=Debt+1000-Debt%1000;
		}
		System.out.println(Debt);
	}
}