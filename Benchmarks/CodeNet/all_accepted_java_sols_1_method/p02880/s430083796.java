import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean band = false;
        n = sc.nextInt();
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                if (i*j == n){
                    band = true;
                    i = 10;
                    j = 10;
                }
            }
        }
        if (band == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}