import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double xa = 0;
		double ya = 0;
		double ra = 0;
		double xb = 0;
		double yb = 0;
		double rb = 0;
		int n = Integer.parseInt(in.readLine());
		for(int i= 0; i < n;i++){
			String ss[] =in.readLine().split(" ");
			xa = Double.parseDouble(ss[0]);
			ya = Double.parseDouble(ss[1]);
			ra = Double.parseDouble(ss[2]);
			xb = Double.parseDouble(ss[3]);
			yb = Double.parseDouble(ss[4]);
			rb = Double.parseDouble(ss[5]);
			double dist = Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2));
			if(ra > rb + dist){
				//a?????\??£?????????
				System.out.println("2");
			}
			else if(rb > ra + dist){
				//b
				System.out.println("-2");
			}
			else if(dist <= ra+rb){
				//????????£?????????
				System.out.println("1");
			}
			else{
				//???????????????
				System.out.println("0");
			}
		}
		

	}

}