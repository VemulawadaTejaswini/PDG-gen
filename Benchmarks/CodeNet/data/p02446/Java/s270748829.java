import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextLong();
        long last = a[0];
        System.out.print(last);
        for(int i = 1 ; i < n ; i++){
            if(a[i] == last);
            else{
                last = a[i];
                System.out.print(" " + last);
            }
        }
        System.out.println();
    }
}
