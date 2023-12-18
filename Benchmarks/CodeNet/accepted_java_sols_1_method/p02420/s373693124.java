import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line; 
        while(true){
            line = sc.next();
            if(line.equals("-")){
                break;
            }
            else{
                char[] c = line.toCharArray();
                int m = sc.nextInt();
                int[] h;
                h = new int[m];
                int Sum = 0;
                for(int j = 0; j < m; j++){
                    h[j] = sc.nextInt();
                    Sum += h[j];
                }
                int rem = Sum % line.length();
                for(int j = rem; j < line.length(); j++){
                    System.out.print(c[j]);
                }
                for(int j = 0; j < rem; j++){
                    System.out.print(c[j]);
                }
                System.out.println("");
            }
        } 
    }    
}
