import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        int j = Integer.parseInt(a);
        long b[];
        b= new long[j];
        long sum = 0;
        
        for(int i = 0; i < j; i++){
            b[i] =sc.nextInt();
            sum = sum+b[i];
        }
        
        long max = b[0];
        long min = b[0];
        
        for(int i = 0; i < j; i++){
            if(max<b[i]){
                max = b[i];
            }
            if(min>b[i]){
                min = b[i];
            }
        }
        
        System.out.println(min + " " + max + " " + sum);
        
    }
}

