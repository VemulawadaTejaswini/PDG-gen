import java.util.Scanner;

public class Main{


	public static void BubbleSort(int[] array){
		int len=array.length;
		int cnt=0;
		int swap;
		for(int i=0;i<len-1;i++){
			for(int j=len-1;i<j;j--){
				if(array[j]<array[j-1]){
					cnt++;
					swap=array[j];array[j]=array[j-1];array[j-1]=swap;
				}
			}
		}
		for(int i=0;i<len;i++){
		System.out.print(array[i]);
		if(i!=len-1)System.out.print(" ");}

		System.out.println();
		System.out.println(cnt);
	}

	public static void main(String[] args){

		int n;

		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] box=new int[n];

		for(int i=0;i<n;i++){
		box[i]=scan.nextInt();
		}

		BubbleSort(box);

		scan.close();

	}

}