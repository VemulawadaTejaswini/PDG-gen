import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),s = a + b;
            if(a == -1 && b == -1 && c == -1) break;
            else if(a == -1 || b == -1) System.out.println("F");
            else if(s >= 80) System.out.println("A");
            else if(s >= 65) System.out.println("B");
            else if(s >= 50) System.out.println("C");
            else if(s >= 30){
                if(c >= 50) System.out.println("C");
                else System.out.println("D");
            }else System.out.println("F");
        }
    }

}