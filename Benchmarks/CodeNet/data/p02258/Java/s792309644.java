import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        int minv = Integer.parseInt(scanner.nextLine());
        int maxv = Integer.MIN_VALUE;
        for(int j = 0; j < n-1; j++){
            int r = Integer.parseInt(scanner.nextLine());
            if(maxv <= r - minv){
                maxv = r -minv;
            }
            if(minv > r){
                minv = r;
            }
        }
        
        System.out.println(maxv);
    }
}

