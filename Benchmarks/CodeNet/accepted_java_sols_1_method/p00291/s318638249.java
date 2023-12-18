import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int coin[]={1,5,10,50,100,500},sum=0;
		
		for(int i=0;i<6;i++){
			sum+=coin[i]*Integer.parseInt(in.next());
		}
		
		if(sum>=1000)System.out.println(1);
		else System.out.println(0);
	}

}

