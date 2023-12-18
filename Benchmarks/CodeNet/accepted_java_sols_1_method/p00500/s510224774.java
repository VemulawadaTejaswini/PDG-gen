import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int prayer= sc.nextInt();
		int[][] point=new int[prayer][3];
		int print[]=new int[prayer];
		
		for(int i=0;i<prayer;i++){
			int point0=sc.nextInt();
			int point1=sc.nextInt();
			int point2=sc.nextInt();	
			point[i][0]=point0;
			point[i][1]=point1;
			point[i][2]=point2;		
		}
		for(int h=0;h<3;h++){
			for(int i=0;i<prayer;i++){
				int z=point[i][h];
				for(int j=0;j<prayer;j++){	
					if(z==point[j][h]&&(i!=j)){
						point[j][h]=0;
						point[i][h]=0;
					}
				}
			}
		}
			for(int j=0;j<prayer;j++){
				int result=0;
				for(int i=0;i<3;i++){
					result=result+point[j][i];
					print[j]=result;		
				}
			}
			for(int i=0;i<prayer;i++){
				System.out.println(print[i]);	
		}
	}
}