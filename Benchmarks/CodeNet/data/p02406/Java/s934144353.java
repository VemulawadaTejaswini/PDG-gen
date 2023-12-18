import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i = 1; i <= n; i++){
            if(i % 3 == 0){
                System.out.print(" " + i);
            } else {
                for(int j = 1; j <= i / 10; j++){
                    if(i % Math.pow(10, j) == 3.0){
                        System.out.print(" " + i);
                    } else if(Math.floor(i / Math.pow(10, j)) == 3.0){
                        System.out.print(" " + i);
                    }
                }
            }
        }
        System.out.println();
    }
}


