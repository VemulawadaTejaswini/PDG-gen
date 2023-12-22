import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int mounth = s.nextInt();
			int day = s.nextInt();
			if(mounth>=1&&mounth<=12&&day>=1&&day<=31) {
				if(mounth>day) {
					System.out.println(mounth-1);
				}else {
					System.out.println(mounth);
				}
			}
}
}