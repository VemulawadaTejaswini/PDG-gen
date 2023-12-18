import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = (a + b + c) / 2;
        if(((a + b + c) % 2) == 1){
            System.out.println("No");
        }
        else if(a == answer){
            System.out.println("Yes");
        }
        else if(b == answer){
            System.out.println("Yes");
        }
        else if(c == answer){
            System.out.println("Yes");
        }
        else if((a + b) == answer){
            System.out.println("Yes");
        }
        else if((a + c) == answer){
            System.out.println("Yes");
        }
        else if((b + c) == answer){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
