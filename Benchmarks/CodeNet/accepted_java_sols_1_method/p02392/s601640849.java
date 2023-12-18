import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String ans = (a < b) && (b < c) ? "Yes" : "No";
        System.out.println(ans);
    }
}
