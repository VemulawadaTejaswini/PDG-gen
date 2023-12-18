import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] num = {0,0,0};
		for(int i=0;i<num.length;i++){
			num[i] = scan.nextInt();
		}
		bubbleSort.sort(num);
		System.out.print(num[0]);
		for(int i=1;i<num.length;i++){
			System.out.print(" "+num[i]);
		}
		System.out.println("");
		scan.close();
	}
}

class bubbleSort{
	public static void sort(int a[]){
		for(int i=0;i<a.length-1;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
	}
}