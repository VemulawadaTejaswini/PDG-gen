import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] data = new int[100];
		int count = 0;
		while(stdIn.hasNext()){
			int k = stdIn.nextInt();
			data[k-1]++;
			if(count>data[k-1]){
				count = data[k-1];
			}
		}
		for(int i=0;i<100;i++){
			if(data[i]==count){
				System.out.println(i+1);
			}
		}
	}
}