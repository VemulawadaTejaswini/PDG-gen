import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 1;

        boolean th = false;

        for(int i = 1; i <= n; i++){
            x = i;
            if(i % 3 == 0){
                System.out.print(" ");
                System.out.print(i);
                continue;
            }

            while(x > 0 && th == false){
                if(x % 10 == 3){
                    th = true;
                }
                x /= 10;
            }
            if(th == true){
                th = false;
                System.out.print(" ");
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
