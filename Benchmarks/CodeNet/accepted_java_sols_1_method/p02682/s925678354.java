import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int k = sc.nextInt();
            if(n1>=k){
                System.out.println(k);
            }
            else{
                if(n1+n2>k){
                    System.out.println(n1);
                }
                else {
                    System.out.println(n1 - (k - (n1 + n2)));
                }
            }
    }
}