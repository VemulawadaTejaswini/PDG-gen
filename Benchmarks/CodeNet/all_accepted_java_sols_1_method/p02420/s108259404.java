import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")) break;
            int m = sc.nextInt();
            int[] array = new int[m];
            String result = str;
            for(int i = 0; i < m; i++){
                int shuffleNum = sc.nextInt();
                result = result.substring(shuffleNum) + result.substring(0, shuffleNum);
            }
            System.out.println(result);
        }
    }
}
