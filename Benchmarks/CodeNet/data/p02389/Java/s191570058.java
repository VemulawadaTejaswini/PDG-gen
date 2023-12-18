import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a * b;
        int s = a + a + b + b;
        System.out.println(sum + " " + s);
    }
}
