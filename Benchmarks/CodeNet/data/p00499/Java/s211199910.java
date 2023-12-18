import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vDay=sc.nextInt();
		int jp=sc.nextInt();
		int mt=sc.nextInt();
		int jpD=sc.nextInt();
		int mpD=sc.nextInt();
		for(int i=vDay;i>=0;i--){
			jp-=jpD;
			mt-=mpD;
			if(jp<=0&&mt<=0){
				System.out.println(i-1);
				break;
			}
		}
	}
}