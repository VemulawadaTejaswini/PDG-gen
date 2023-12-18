import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a[] = new double[6];
			for(int i=0;i<6;i++){
				a[i]=sc.nextDouble();
			}

			double x,y;

			if(a[0]==0 && a[4]==0){
				y=a[2]/a[1];
				x=a[5]/a[3];
			}else if(a[1]==0 && a[3]==0){
				x=a[2]/a[0];
				y=a[5]/a[4];
			}else if(a[4]==0){
				x=a[5]/a[3];
				y=(a[2]-a[0]*x)/a[1];	
			}else if(a[3]==0){
				y=a[5]/a[4];
				x=(a[2]-a[1]*y)/a[0];
			}else{
				x = (a[2]-a[1]*a[5]/a[4])/(a[0]-a[1]*a[3]/a[4]);
				y = (a[2]-a[0]*a[5]/a[3])/(a[1]-a[0]*a[4]/a[3]);
			}
			System.out.println(String.format("%.3f",x)+" "+String.format("%.3f",y));
		}
	}
}
