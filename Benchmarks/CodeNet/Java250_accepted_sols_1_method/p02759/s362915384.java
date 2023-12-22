import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int page = N/2;
        if(N%2!=0) page++;
        System.out.println(page);
    }
}