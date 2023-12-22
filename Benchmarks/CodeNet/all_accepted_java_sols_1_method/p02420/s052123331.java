import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int i, j, k;
        int sum = 0;
        
        while(true) {
            String alphabet = sc.next();
            
            if(alphabet.equals("-")) break;
            int m = sc.nextInt();
            
            for(i = 0; i < m; i++) {
                int h = sc.nextInt();
                alphabet = alphabet.substring(h) + alphabet.substring(0, h);
            }
            System.out.println(alphabet);
        }
    }
}

