import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		String str=in.next();
		String[] data=str.split("/");
		int[] idata=new int[3];

		for(int i=0;i<data.length;i++)idata[i]=Integer.parseInt(data[i]);
		
		if(idata[0] > 2019 ||(idata[0]>=2019 && idata[1]>4))System.out.println("TBD");
		else System.out.println("Heisei");
	}

}
