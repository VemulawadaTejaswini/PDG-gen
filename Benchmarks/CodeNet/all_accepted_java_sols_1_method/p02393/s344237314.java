import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i < 3; i++){
            num[i] = input.nextInt();
        }
        for(int i = 2; i > 0; i--){
            for(int j = 0; j < i; j++){
                int temp = 0;
                if(num[j] > num[j+1]){
                    temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(String.format("%d %d %d", num[0], num[1], num[2]));
    }
}

