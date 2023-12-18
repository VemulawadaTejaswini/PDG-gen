import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double[] point = new double[8];
		double a,b,c,d;
		while(scan.hasNext()){
			for(int i=0;i<8;i++){
				point[i] = scan.nextDouble();
			}
			a = Math.abs(point[0]*(point[3]-point[5])+point[2]*(point[5]-point[1])+point[4]*(point[1]-point[3]))/2;
			b = Math.abs(point[6]*(point[3]-point[5])+point[2]*(point[5]-point[7])+point[4]*(point[7]-point[3]))/2;
			c = Math.abs(point[0]*(point[7]-point[5])+point[6]*(point[5]-point[1])+point[4]*(point[1]-point[7]))/2;
			d = Math.abs(point[0]*(point[3]-point[7])+point[2]*(point[7]-point[1])+point[6]*(point[1]-point[3]))/2;
			
			if(a == b+c+d){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}