import java.util.Scanner;

public class Main {

	static int base =0;
	static int point =0;
	static int outs=0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inning = scan.nextInt();
		int[] pointlog = new int[inning];
		String action;
		while(true){
			action = scan.next();
			if(action.equals("HIT")){
				basemove(1);
			}
			if(action.equals("HOMERUN")){
				basemove(2);
			}
			if(action.equals("OUT")){
				outs++;
				if(outs==3){
					outs=0;
					pointlog[pointlog.length-inning]=point;
					point=0;
					base=0;
					inning--;
					if(inning==0){
						for(int i=0; i<pointlog.length; i++)
							System.out.println(pointlog[i]);
						System.exit(0);
					}
				}
			}

		}

	}

	static void basemove(int state){
		//HIT
		if(state==1){
			base = base<<1;
			base++;
			if((base>>3)%2==1){
				base-=8;
				point++;
			}
		}
		//HOMERUN
		if(state==2){
			point+=(base>>2)%2+(base>>1)%2+(base>>0)%2+1;
			base=0;
		}
	}

}