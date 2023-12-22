import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] height=new int[10];
		int temp;
		for(int a=0;a<height.length;a++){
			height[a]=scanner.nextInt();
		}
		for(int i=0;i<height.length;i++){
			for(int j=0;j<height.length-1;j++){
				if(height[j]<height[j+1]){
					temp=height[j];
					height[j]=height[j+1];
					height[j+1]=temp;
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(height[i]);
		}
	}
}