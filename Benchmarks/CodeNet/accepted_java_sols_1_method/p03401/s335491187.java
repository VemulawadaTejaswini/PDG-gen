import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mapNum=sc.nextInt();
		int point[]=new int[mapNum+2];
		point[0]=0;
		point[mapNum+1]=0;
		for(int i=1;i<mapNum+1;i++) {
			point[i]=sc.nextInt();
		}
		int distance=0;
		for(int i=0;i<mapNum+1;i++) {
			distance+=Math.abs(point[i]-point[i+1]);
	}
		for(int i=1;i<mapNum+1;i++) {
			System.out.println(distance+Math.abs(point[i-1]-point[i+1])
			-Math.abs(point[i-1]-point[i])-Math.abs(point[i]-point[i+1]));
		}
}
	}