import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < 3; i++){
            int d = sc.nextInt();
        }
        int y = sc.nextInt();
        int n = sc.nextInt();
        if(y - x > n){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
        
    }
}
