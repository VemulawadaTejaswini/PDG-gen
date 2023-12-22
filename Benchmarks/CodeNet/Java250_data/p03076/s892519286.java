import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 5つの調理時間の入力
    int[] arr = new int[5];
    for (int i=0; i<arr.length; i++) {
    	arr[i] = sc.nextInt();
    }
    
    // 一番最後に注文する料理を計算
    // 割り切れず、あまりが最小のもの
    int last_dish = 6;
    int amari_smallest = 11;
    int amari = 0;
    
    for (int i=0; i<arr.length; i++) {
    	if (arr[i] % 10 != 0) {
        	amari = arr[i] % 10;
            if (amari < amari_smallest) {
            	amari_smallest = amari;
                last_dish = i;
            }
        }
    }
    
    // 最後の料理以外は10で切り上げた後で10倍する
    int total = 0;
    for (int i=0; i<arr.length; i++) {
    	if (i==last_dish) {
        	total += arr[i];
        } else {
        	total += ((arr[i] + 10 - 1) / 10 ) * 10;
        }
    }
    
    // 出力
    System.out.println(total);
  }
}