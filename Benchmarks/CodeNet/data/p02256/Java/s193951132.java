import java.util.Scanner;


class Main {
    static int gcd (int x, int y) {
        int temp;
        while((temp = x%y)!=0) {
            x = y;
            y = temp;
        }
        return y;
    }

    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int x = stdIn.nextInt();
    int y = stdIn.nextInt();
    int z;
    if(x<y){
        z = x;
        x = y;
        y = z;
    }

    System.out.println(gcd(x,y));

    stdIn.close();
    }


}
