import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int s;
        for(int i = 0; i < 3; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < 2; i++){
            for(int j = 2; j > i; j--){
                if(a[j] < a[j-1]){
                    s = a[j];
                    a[j] = a[j-1];
                    a[j-1] = s;
                }
            }
        }
        System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
    }
}
