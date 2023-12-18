
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int N=in.nextInt();
			int count=0;
			for(int i=1;i<=N;i++) {
				count=0;
				for(int x=1;x<=i;x++) {
					if(x*x>=i) {
						break;
					}
					for(int y=1;y<=i;y++) {
						if(x*x+y*y+x*y>=i) {
							break;
						}
						for(int z=1;z<=i-x*x-y*y;z++) {
							if(z*z+z*x+y*z+x*x+y*y+x*y==i) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}
