import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int s;
		s=0;
		for(int i=0;i<5;++i){
			int x;
			x=cin.nextInt();
			if(x<40){
				s=s+40;
			}else if(x>=40){
				s=s+x;
			}
		}System.out.println(s/5);
	}
}