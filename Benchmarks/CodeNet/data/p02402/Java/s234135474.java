import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    long sum = 0;
	    String line = in.nextLine();
	    String[] array = line.split(" ");
	    int a = Integer.parseInt(array[0]);
	    int min = a;
	    int max = a;
		for(int i = 1; i<n; i++){
			int b = Integer.parseInt(array[i]);
			if(b<min){
				min = b;
			}
			if(max<b){
				max = b;
			}
			sum += b;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}