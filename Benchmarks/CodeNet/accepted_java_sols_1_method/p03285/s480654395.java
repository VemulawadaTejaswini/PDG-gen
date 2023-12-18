import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        boolean yes = false;
        for(int i = 0; i <= 25; i++){
            for(int j = 0; j <= 14; j++){
                if(i*4 + j*7 == n){
                    yes = true;
                    break;
                }
            }
        }
        
        if(yes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}