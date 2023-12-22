import java.util.Scanner;

class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextInt()){
				double[] a=new double[6];
				for(int i=0;i<6;i++)a[i]=Double.parseDouble(sc.next());
				double x = (a[2]*a[4]-a[1]*a[5])/(a[0]*a[4]-a[1]*a[3]);
				double y = (a[0]*a[5]-a[2]*a[3])/(a[0]*a[4]-a[1]*a[3]);
				
				System.out.println(String.format("%.3f %.3f",x+0.0,y+0.0));
				
			}
		}
	}
}