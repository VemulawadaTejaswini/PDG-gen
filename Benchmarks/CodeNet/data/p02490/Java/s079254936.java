import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lef = sc.nextInt();
		int rig = sc.nextInt();
		while(lef != 0 && rig != 0){
			if(rig < lef){
				int sub = rig;
				rig = lef;
				lef = sub;
			}
			System.out.println(lef+" "+rig);
			lef = 0;
			lef = 0;
			lef = sc.nextInt();
			rig = sc.nextInt();
		}
	}

}