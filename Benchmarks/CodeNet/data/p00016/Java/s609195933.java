import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		int kakudo=90;
		int kyori=0,kaiten=0;
		double posx=0,posy=0;

		while(true) {
			sc=new Scanner(System.in);
			str=sc.next();
			String[] pr=str.split(",");
			kyori=Integer.parseInt(pr[0]);
			kaiten=Integer.parseInt(pr[1]);

			if(kyori==0 && kaiten==0) {
				break;
			}
			posx+=((double)kyori)*Math.cos(kakudo*Math.PI/180);
			posy+=((double)kyori)*Math.sin(kakudo*Math.PI/180);
			kakudo-=kaiten;
		}
		System.out.println((int)posx);
		System.out.println((int)posy);
		sc.close();
	}
}
