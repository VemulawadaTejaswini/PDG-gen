import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int min = 0;
	    int max = 0;
	    long sum = 0;
	    String line = in.nextLine();
	    String[] array = line.split(" ");
		for(int i = 0; i<n; i++){
			int a = Integer.parseInt(array[i]);
			if(a<min){
				min = a;
			}
			if(max<a){
				max = a;
			}
			sum += a;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}