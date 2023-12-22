import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = 0, i = 0;
        while(true){
            x = scan.nextInt();
            if(x == 0) break;
            i++;
            System.out.println("Case " + i + ": " + x);
        }
    }
}
