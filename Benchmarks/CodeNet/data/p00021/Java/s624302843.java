import java.util.*;	
public class Main {
	public static void main(String[] args) {
					Scanner in =new Scanner(System.in);
					int n=in.nextInt();
					for (int i = 0; i < n; i++) {
						double x1=in.nextDouble();
						double y1=in.nextDouble();
						double x2=in.nextDouble();
						double y2=in.nextDouble();
						double x3=in.nextDouble();
						double y3=in.nextDouble();
						double x4=in.nextDouble();
						double y4=in.nextDouble();
						double X1=x2-x1;
						double Y1=y2-y1;
						double X2=x4-x3;
						double Y2=y4-y3;
						if((X1*Y2-X2*Y1)==0){
							System.out.println("YES");
						}
						else{
							System.out.println("NO");
						}
					}
					in.close();
			}
	}
