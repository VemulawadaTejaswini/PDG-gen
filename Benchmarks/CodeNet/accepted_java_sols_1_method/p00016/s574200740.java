import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int angle = 0;
		double px = 0.0;
        double py = 0.0;
		while(true){
			String xy=sc.next();
			if(xy.equals("0,0")){
				break;
			}else{
				String[] xyArr=xy.split(",");
				double x=Integer.parseInt(xyArr[0]);
				double y=Integer.parseInt(xyArr[1]);
		        px+=x*Math.sin(angle*Math.PI/180);
	            py+=x*Math.cos(angle*Math.PI/180);
	            angle+=y;
			}
		}
		System.out.printf("%d\n%d\n", (int)px, (int)py);
	}
}