import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
int y = 0;
        for (int x = 0; x < n; x++){
            a[x] = scan.nextInt();
        }
        for(int x = n -1; x > -1; x--){
            b[x] = a[y];
            y++;
        }
        for (int x = 0; x < n; x++){
            if(x == n -1){
                System.out.print(b[x]);
            }
            else {
                System.out.print(b[x] + " ");
            }
        }
    }
}

