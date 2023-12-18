
import java.util.Scanner;

public class Main {
	  public static void main(String[] agrs){
		   Scanner a = new Scanner(System.in);		   
			int data [] = new int[a.nextInt()];
			for(int i = 0;i<data.length;i++) {
				data[i]=a.nextInt();
			}
			int count = 0;
			for(int i = 0;i < data.length;i++) {
				for(int j = i + 1; j<data.length;j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data [j]= temp;
					count ++;
				}
			}
		  }
			for(int i =0;i<data.length;i++) {
				System.out.print(data[i]+" ");
			}
			System.out.println();
			System.out.println(count);
			a.close();

	  }
}
