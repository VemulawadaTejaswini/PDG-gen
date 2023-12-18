import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] word = sc.next().split("",0);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            String test = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int count = 0;
            if(test.equals("replace")){
                String[] str = sc.next().split("",0);
                for(int j = num1; j <= num2; j++){
                    word[j] = str[count];
                    count++;
                }
            }
            else if(test.equals("reverse")){
                String[] reverse = new String[num2 - num1 + 1];
                for(int l = num2; l >= num1; l--){
                    reverse[count] = word[l];
                    count++;
                }
                count = 0;
                for(int m = num1; m <= num2; m++){
                    word[m] = reverse[count];
                    count++;
                }
            }
            else {
                for(int k = num1; k <= num2; k++){
                    System.out.print(word[k]);
                }
                System.out.println();
            }
        }
    }
}
