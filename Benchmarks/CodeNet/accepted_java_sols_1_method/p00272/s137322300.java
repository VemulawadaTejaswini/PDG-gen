import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int P[]={6000,4000,3000,2000};
		for(int i=0;i<4;i++){
			int j=in.nextInt(),k=in.nextInt();
			System.out.println(P[j-1]*k);
		}
	}

}

