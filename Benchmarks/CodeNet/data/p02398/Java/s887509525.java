import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int counter = 0;
        for(int i = a; i <= b; i++){
            if(c%i == 0)counter++;
        }
        System.out.println(counter);
    }
}

