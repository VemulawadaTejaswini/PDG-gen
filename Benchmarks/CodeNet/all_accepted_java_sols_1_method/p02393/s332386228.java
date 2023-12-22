import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        String[] str = new String[3];
        str = strInput.split(" ");
        int[] check = {Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2])};
       Arrays.sort(check);
       System.out.println(check[0] + " " + check[1] + " " + check[2]);
    }
}
