import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a < 10 && b < 10){
            System.out.println(a*b);
        }else{
            System.out.println(-1);
        }
        
        scan.close();
    }
}