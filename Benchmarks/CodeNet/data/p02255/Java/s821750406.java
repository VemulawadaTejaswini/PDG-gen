import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();//配列の個数受け取り
        int[] array = new int[num];

        for(int i = 0; i < num; i++) {
         array[i] = scan.nextInt();

        }

         int v, j;
         	for(int i = 1; i <= num-1; i++) {
         		 v = array[i];
         		 j = i - 1;
         		 for(int a = 0; a < num; a++) {
         		System.out.print(array[a]);
if(a < num -1){
System.out.print(" ");
         		}
         		 }
         		 System.out.println();
         		while(j >= 0 && array[j] > v) {
         			array[j+1] = array[j];
         			j--;
         			array[j+1] = v;
         		}
         	}
                for(int a = 0; a < num; a++) {
         		System.out.print(array[a]);
if(a < num -1){
System.out.print(" ");
         		}
	    }
System.out.println();
}
}

