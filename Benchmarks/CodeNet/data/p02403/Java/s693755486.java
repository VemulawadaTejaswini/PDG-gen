import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int k=0; k<10000; k++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0){
            break;
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.printf("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}
}
