import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberArray [] = new int [n];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            numberArray[i] = sc.nextInt();
        }
        //バブルソート
        
        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j >= i + 1; j--){
                if(numberArray[j - 1] > numberArray[j]){
                    count++;
                    int tmp = numberArray[j];
                    numberArray[j] = numberArray[j - 1];
                    numberArray[j - 1] = tmp;
                    
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0){
                stringBuilder.append(" ");
            }
                stringBuilder.append(numberArray[i]);
        }
        stringBuilder.append("\n").append(count);
        System.out.println(new String(stringBuilder));
    }
}
