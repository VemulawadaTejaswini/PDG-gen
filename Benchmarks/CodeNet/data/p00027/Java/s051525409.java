import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=0, m=0, d=0;
		String[] day = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		int[] n = {0,31,29,31,30,31,30,31,31,30,31,30};
		while(true){
		    m = s.nextInt();
		    if(m==0)break;
		    d = s.nextInt();
		    num = 0;
		    for(int i=0 ; i<m ; i++)
			num += n[i];
		    num += d;
		    System.out.println(day[num%7]);
		}
	}
}