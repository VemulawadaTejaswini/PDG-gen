import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int circle=input.nextInt();
		for(int i=0;i<circle;i++){
/*			String[] str=input.nextLine().split(" ");*/
			double[] num=new double[6];
			for(int j=0;j<num.length;j++){
				num[j]=input.nextDouble();
				/*System.out.println(+" "+num[i]);*/
			}
			/*System.out.println(num[5]);*/
			double a1=2*(num[2]-num[0]);		
			double b1=2*(num[3]-num[1]);
			double c1=num[2]*num[2]+num[3]*num[3]-num[0]*num[0]-num[1]*num[1];
			double a2=2*(num[4]-num[2]);
			double b2=2*(num[5]-num[3]);
			double c2=num[4]*num[4]+num[5]*num[5]-num[2]*num[2]-num[3]*num[3];
			/*System.out.println(a1+" "+b1+" "+c1+" "+a2+" "+b2+" "+c2);*/
			double x=(c1*b2-c2*b1)/(a1*b2-a2*b1);
			double y=(a1*c2-a2*c1)/(a1*b2-a2*b1);
			
			double r=Math.sqrt((num[0]-x)*(num[0]-x)+(num[1]-y)*(num[1]-y));
			System.out.printf("%.3f %.3f %.3f\n",x,y,r);
			
		}
	}

}