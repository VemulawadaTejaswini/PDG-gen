import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0,cv[]= {1,5,10,50,100,500};
		for(int i=0;i<6;i++)sum+=in.nextInt()*cv[i];
		if(sum>=1000)System.out.println(1);
		else System.out.println(0);
	}

}
