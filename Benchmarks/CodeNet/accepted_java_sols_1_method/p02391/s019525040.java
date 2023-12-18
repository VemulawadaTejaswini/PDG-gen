import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n;
        n = in.nextInt();
        int b = n;

        if(a < b){
            System.out.println("a < b");
        }else if(a == b){
            System.out.println("a == b");
        }else{
            System.out.println("a > b");
        }
        in.close();
    }
}

