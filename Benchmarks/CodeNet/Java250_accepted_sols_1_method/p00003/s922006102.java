import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] judge = new boolean[n];
        if(n > 1000) n = 1000;
        for(int i = 0;i < n;i++){
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
            judge[i] = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
        }
        for(int i = 0;i < n;i++){
            System.out.println(judge[i] ? "YES" : "NO");
        }
    }
}