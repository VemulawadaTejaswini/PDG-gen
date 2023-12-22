import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = 0;

        if(a == 5){
            total += 5;
        }
        if (a == 7){
            total += 7;
        }
        if( b == 5){
            total += 5;
        }
        if ( b == 7){
            total += 7;
        }
        if( c == 5){
            total += 5;
        }
        if ( c == 7){
            total += 7;
        }

        if(total == 17){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}