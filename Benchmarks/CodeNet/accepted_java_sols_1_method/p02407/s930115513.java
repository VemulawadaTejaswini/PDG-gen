import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        for (int x = 0; x < n; x++){
            a[x] = scan.nextInt();
        }
        for(int x = n -1; x > -1; x--){
            if(x == 0){
                System.out.println(a[x]);
            }
            else {
                System.out.print(a[x] + " ");
            }
        }
    }
}
