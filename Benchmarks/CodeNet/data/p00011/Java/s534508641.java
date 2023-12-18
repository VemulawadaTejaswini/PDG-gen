import java.util.Scanner;
public class Main{
	private static void change(int data[],int f,int s){
		int temp = data[f-1];
		data[f-1] = data[s-1];
		data[s-1] = temp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		scan.useDelimiter(",");
		int[] data = new int[w];
		for(int i=0;i<w;i++){
			data[i]=i+1;
		}
		int first =0;
		int second =0;
		for(int i=0;i<n;i++){
			first = scan.nextInt();
			second = scan.nextInt();
			change(data,first,second);
		}
		for(int i=0;i<=n;i++)
			System.out.println(data[i]);
	}

}