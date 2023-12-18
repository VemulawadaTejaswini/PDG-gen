import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int a[] = new int[5]; // 配列確保（大きめに）
        int n = 0; // データ数
        // データ入力
        for (int i = 0; i < 3; i++) {
            a[n] = scanner.nextInt();
            n++;
        }
	  	
        for (int i = 0; i < 3; i++) {
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[pos]) {
                    pos = j;
                }
            }
            int w = a[i];
            a[i] = a[pos];
            a[pos] = w;
        }
		for (int i = 0; i < 2; i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println(a[2]);
        scanner.close();
  }
}
