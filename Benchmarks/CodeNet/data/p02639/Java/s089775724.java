import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            int in = scan.nextInt();
            if(in==0)
                System.out.println(i+1);
        }
    }
}