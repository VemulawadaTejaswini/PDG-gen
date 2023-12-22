import java.util.Scanner;

class Main {
    static public void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int Apizza = scan.nextInt();
        int Bpizza = scan.nextInt();
        int ABpizza = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int price=(int)1e9;

        price = Math.min(price, ABpizza * Math.max(X,Y)) * 2;
        price = Math.min(price, ABpizza * Math.min(X,Y) * 2 + (Math.max(X,Y)==X ? Apizza : Bpizza) * Math.abs(X-Y));
        price = Math.min(price, Apizza * X + Bpizza * Y);

        System.out.println(price);

    }
}