import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        if(n > m) for(int i = 0; i < n;i++) System.out.print(Integer.toString(m));
        else for(int i = 0; i < m;i++) System.out.print(Integer.toString(n));
    }
}