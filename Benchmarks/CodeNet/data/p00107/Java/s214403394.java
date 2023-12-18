import java.awt.geom.Point2D;
import java.util.*;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0107();
	}
	class AOJ0107{
		int tate,yoko,height;
		boolean hantei(int r){
			int x = tate,y = yoko;
			if(new Point2D.Double(x,y).distance(0,0)<2*r)return true;
			x=tate;y=height;
			if(new Point2D.Double(x,y).distance(0,0)<2*r)return true;
			x=yoko;y=height;
			if(new Point2D.Double(x,y).distance(0,0)<2*r)return true;
			return false;
		}
		public AOJ0107() {
			while(true){
				tate = in.nextInt();
				yoko = in.nextInt();
				height = in.nextInt();
				if(tate+yoko+height==0)break;
				int n = in.nextInt();
				for(int s=0;s<n;s++){
					int r = in.nextInt();
					if(hantei(r))System.out.println("OK");
					else System.out.println("NA");
				}
			}
			
		}
	}
}