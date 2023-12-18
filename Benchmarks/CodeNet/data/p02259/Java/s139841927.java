import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 標準入力の読み込み開始
        Scanner scanner = new Scanner(System.in);

        // 数列の長さ
        int n = scanner.nextInt();

        // 数列
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numList.add(scanner.nextInt());
        }

        // 標準入力の読み込み終了
        scanner.close();

        // 処理実行
        
        int flag = 1; // 逆の隣接要素が存在する
        int c = 0; //カウンタ
        while (flag == 1){
            flag = 0;
            for(int j = n-1; j >= 1; j--){
            //for j が N-1 から 1 まで
                if(numList.get(j)<numList.get(j-1)){
                //if A[j] < A[j-1]
                    //A[j] と A[j-1] を交換
                   
                    numList.add(j-1,numList.get(j));
                    numList.remove(j+1);
                    
                    c++;
                    
                    flag = 1;
                }
            }
        }        
        
        for(int i =0; i<n; i++){
	System.out.print(numList.get(i));
	if(i < n-1){
	    System.out.print(" ");
	}
        }
        System.out.println();
        
        System.out.println(c);
    }
}
