import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int H=in.nextInt(),res;
		
		if(H>=3)res=1;
		else if(H<-3)res=-1;
		else res=0;
		System.out.println(res);
	}

}

