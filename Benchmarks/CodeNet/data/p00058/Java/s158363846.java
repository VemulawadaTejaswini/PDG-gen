import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			double x4=sc.nextDouble();
			double y4=sc.nextDouble();
			if(((x1-x2)*(y3-y1)+(y1-y2)*(x1-x3))*((x1-x2)*(y4-y1)+(y1-y2)*(x1-x4))<0){
				if(((x3-x4)*(y1-y3)+(y3-y4)*(x3-x1))*((x3-x4)*(y2-y3)+(y3-y4)*(x3-x2))<0){
					System.out.println("YES");
					continue;
				}
			}
			System.out.println("NO");
		}
	}
}