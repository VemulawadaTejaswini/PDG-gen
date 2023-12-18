import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h;
        int max = 0;
        boolean can = true;
        
        for(int i = 0; i < n; i++){
            h = sc.nextInt();
            if(h <= (max-2)){
                can = false;
                break;
            }else if(h > max){
                max = h;
            }
        }
        
        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}