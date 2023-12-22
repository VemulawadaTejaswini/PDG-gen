import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,x;
        int a;
        str = scan.nextLine();
        a = Integer.valueOf(str);
        str = scan.nextLine();
        String[] nums = str.split(" ", 0);
        int[] b = new int[a];
        i = 0;
        for (String num: nums){
            b[i++] = Integer.valueOf(num);
        }

        for(i = a-1; i > 0; i--){
            System.out.print(b[i]+" ");
        }
         System.out.print(b[0]);
        System.out.println();
        scan.close();
    }
}
