import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        int count = 0;
        int p;
        for(int i = 1; i <= n; i++){
            p = sc.nextInt();
            if(p != i){
                count++;
            }
        }
        
        if(count == 0 || count == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}