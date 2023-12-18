import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double x1, x2, x3, x4, y1, y2, y3, y4;
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			
		}
	}
	static boolean read(){
		int n;
		n = sc.nextInt();
		if(!sc.hasNext())
			return false;
		
		for(int i = 0; i < n; i++){
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();			
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			/*System.out.println(x1+" "+ y1+" "+ x2+" "+ y2+" "+
							x3+" "+y3+" "+ x4+" "+ y4);*/
			slove();
		}
		return true;
	}
	static void slove(){
		double a1, a2;
		if(x2-x1 == 0 && x4-x3 == 0){
			System.out.println("YES");
		}else if(x2-x1 == 0 || x4-x3 == 0){
			System.out.println("NO");
		}else{
			a1 = (y2-y1)/(x2-x1);
			a2 = (y4-y3)/(x4-x3);
			if(a1 == a2){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}