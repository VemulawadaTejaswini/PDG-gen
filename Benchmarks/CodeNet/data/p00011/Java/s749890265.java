import java.util.Scanner;
public class Main{
	private static int f;
	private static int s;
	Amida(int first,int second){
		f=first;
		s=second;
	}
	private static void change(int data[]){
		int temp = data[f-1];
		data[f-1] = data[s-1];
		data[s-1] = temp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] data = new int[w];
		for(int i=0;i<w;i++){
			data[i]=i+1;
		}
		int first =0;
		int second =0;
		scan.useDelimiter(",");
		for(int i=0;i<n;i++){
			first = scan.nextInt();
			second = scan.nextInt();
			Amida amida = new Amida(first,second);
			amida.change(data);
		}
		for(int i=0;i<=n;i++)
			System.out.println(data[i]);
	}

}