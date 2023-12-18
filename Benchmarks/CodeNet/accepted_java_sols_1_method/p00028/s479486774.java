
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] data = new int[101];
		int count = 0;
		while(stdIn.hasNext()){
			int k = stdIn.nextInt();
			data[k]++;
			if(count<data[k]){
				count = data[k];
			}
		}
		for(int i=1;i<101;i++){
			if(data[i]==count){
				System.out.println(i);
			}
		}
	}
}