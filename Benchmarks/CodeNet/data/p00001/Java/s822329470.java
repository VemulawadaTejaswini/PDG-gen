import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		int[] heights=new int[10];
		for(int i=0;i<10;i++){
			System.out.println("Input height for mountain "+(i+1)+":");
			heights[i]=input.nextInt();
		}
		for(int i=0;i<3;i++){
			int currentMax=0;
			int maxIndex=0;
			for(int j=0;j<10;j++){
				if(heights[j]>currentMax){
					currentMax=heights[j];
					maxIndex=j;
				}
			}
			heights[maxIndex]=-1;
			System.out.println(currentMax);
		}
	}
}