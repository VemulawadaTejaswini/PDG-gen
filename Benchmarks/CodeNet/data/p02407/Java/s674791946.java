import java.util.Scanner;

//配列の並びを反転し、表示する。

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		//要素数の入力を受け取る
		int num = sc.nextInt();
		
		//配列の要素の入力を受け取る
		int[] array = new int[num];//配列を作る
		
		for (int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		//配列の要素の並びを反転する
		reverse(array);
        
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]);
                if(i<array.length-1){
                    System.out.print(" ");
                }
			}
			System.out.println();
        
		sc.close();
	}		
	
	//要素の並びを反転する
		static void reverse(int[] a){
			for(int i = 0; i < a.length /2; i++){
				swap(a,i,a.length - i - 1);
			}
		}
		
	//配列の要素を交換する
		static void swap(int[] a,int x, int y){
			int tmp = a[x];
			a[x]=a[y];
			a[y]=tmp;
		}

}
