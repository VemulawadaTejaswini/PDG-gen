import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int t = s.nextInt()%39;
			if(t==0) t=39;
			System.out.printf("3C%02d\n",t);
		}
	}
}