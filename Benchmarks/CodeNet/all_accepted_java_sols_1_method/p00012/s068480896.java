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
			double xp=sc.nextDouble();
			double yp=sc.nextDouble();
			double z1=(x3-x2)*(yp-y2)-(y3-y2)*(xp-x2);
            double z2=(x1-x3)*(yp-y3)-(y1-y3)*(xp-x3);
            double z3=(x2-x1)*(yp-y1)-(y2-y1)*(xp-x1);
            if(z1>=0&&z2>=0&&z3>=0||z1<=0&&z2<=0&&z3<=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}