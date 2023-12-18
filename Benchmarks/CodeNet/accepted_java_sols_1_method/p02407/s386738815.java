import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        
        for(int i = num - 1; i >= 0; i--){
            array[i] = sc.nextInt();
        }
        
        sb.append(array[0]);
        
        for(int i = 1; i < num; i++){
            sb.append(" " + array[i]);
        }
        System.out.println(sb);
    }
}
