import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int H=in.nextInt(),r=in.nextInt(),res;
		if(H+r==0)res=0;
		else if(H+r>0)res=1;
		else res=-1;
		System.out.println(res);
	}

}

