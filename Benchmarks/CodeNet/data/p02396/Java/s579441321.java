import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] data = new int[1000000];
		int button = 0;
		int i = 0;
		while(button == 0){
			data[i] = sc.nextInt();
			if(data[i] == 0){
				button = 1;
			}
			i++;
		}
		int j ;
		for(j = 0; j<=i; j++){
			if(data[j] != 0){
				System.out.println("case "+(j+1)+": "+data[j]);
			}
		}
	}
}