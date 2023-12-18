import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),cnt=0,max=0;
		for(int i=0;i<n;i++){
			if(in.nextInt()==1)cnt++;
			else {
				max=Math.max(max, cnt);
				cnt=0;
			}
		}
		max=Math.max(max, cnt);
		System.out.println(max+1);
	}

}
