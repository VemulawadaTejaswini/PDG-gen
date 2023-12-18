import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int[] x = new int[10000];
        for(int i = 1; i <= 10000; i++){
            x[i] = scan.nextInt();
            if(x[i] == 0){
                break;
            }
            System.out.println("case " + i + " : " + x[i]);
        }
    }
}