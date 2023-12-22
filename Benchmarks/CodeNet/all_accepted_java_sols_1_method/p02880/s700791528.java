import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        for(int i=1;i<10;i++){
            if(n%i==0 && n/i<=9){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}