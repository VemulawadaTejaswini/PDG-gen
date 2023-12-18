import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ac=0,wa=0,tle=0,re=0;
		for(int i=0;i<n;i++){
			String result = sc.next();
			switch (result){
			case "AC":
				ac += 1;
				break;
			case "WA":
				wa += 1;
				break;
			case "TLE":
				tle += 1;
				break;
			case "RE":
				re += 1;
				break;
			default:
			}
		}
		System.out.println("AC x "+ ac);
		System.out.println("WA x "+ wa);
		System.out.println("TLE x "+ tle);
		System.out.println("Re x "+ re);
	}
}