import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        sc.close();
        Arrays.sort(i);
        String s = "";
        for(int j: i) s = s + j + " ";
        System.out.println(s);
    }
}