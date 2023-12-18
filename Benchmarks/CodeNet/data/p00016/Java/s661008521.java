import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		int kakudo=0;
		int kyori=0,kaiten=0;
		double posx=0,posy=0;

		sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			String[] pr=str.split(",");
			kyori=Integer.parseInt(pr[0]);
			kaiten=Integer.parseInt(pr[1]);

			if(kyori==0 && kaiten==0) {
				break;
			}
			posx+=((double)kyori)*Math.sin(kakudo*Math.PI/180);
			posy+=((double)kyori)*Math.cos(kakudo*Math.PI/180);
			System.out.printf("%d\n%d\n", (int)posx, (int)posy);
			kakudo-=kaiten;
			sc=new Scanner(System.in);
		}
		System.out.printf("%d\n%d\n", (int)posx, (int)posy);
		sc.close();
	}
}
