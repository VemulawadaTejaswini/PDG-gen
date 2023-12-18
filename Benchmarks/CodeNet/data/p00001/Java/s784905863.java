import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int[] highests={0,0,0};
		for(int i=0;i<10;i++){
			int height=Integer.parseInt(sc.nextLine());

			if(highests[0]<=height){
				highests[2]=highests[1];
				highests[1]=highests[0];
				highests[0]=height;

			}else if(highests[1]<=height){
				highests[2]=highests[1];
				highests[1]=height;
			}else if(highests[2]<=height){
				highests[2]=height;
			}
		}

		System.out.println(highests[0]);
		System.out.println(highests[1]);
		System.out.println(highests[2]);

	}
}