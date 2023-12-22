import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lef,rig;
		while(true){
			lef = sc.nextInt();
			rig = sc.nextInt();
			if(lef == 0 && rig == 0) break;
			
			if(lef > rig){
				int sub = rig;
				rig = lef;
				lef = sub;
			}
			System.out.println(lef+" "+rig);
		}
	}
}