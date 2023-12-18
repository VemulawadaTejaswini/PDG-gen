import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int[] x = new int[10000];
        int k=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            x[i] = scanner.nextInt();
            if(x[i]==0){
                break;
            }
            k++;
        }
        for(int j=0;j<k;j++){
            System.out.println("Case "+(j+1)+": "+x[j]);

        }


    }
}

