import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        int[] num = new int[cnt];
        for(int i = 0; i < cnt; i ++)
            num[i] = input.nextInt();
        for(int j = cnt - 1; j > 0; j --)
            System.out.print(num[j] + " ");
        System.out.println(num[0]);
    }
}
