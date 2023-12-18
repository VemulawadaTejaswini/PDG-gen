import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int w = stdIn.nextInt();
        int num[] = new int[w];
        
        for(int i = 0; i < w; i++){
            num[i] = i + 1;
        }
        
        int n = stdIn.nextInt();
        
        for(int i = 0; i < n; i++){
            String s = stdIn.next();
            String ss[] = s.split(",");
            int a = Integer.valueOf(ss[0]) - 1;
            int b = Integer.valueOf(ss[1]) - 1;
            
            int tmp = num[a];
            num[a] = num[b];
            num[b] = tmp;
            
        }
        
        for(int i = 0; i < w; i++){
            System.out.println(num[i]);
        }
    }
}

