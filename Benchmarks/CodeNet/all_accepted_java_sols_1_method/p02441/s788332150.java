import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        
        //int x = stdIn.nextInt();
        int num[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        int q = stdIn.nextInt();
        
        for(int i = 0; i < q; i++){
            int b = stdIn.nextInt();
            int e = stdIn.nextInt();
            int k = stdIn.nextInt();
            
            int count = 0;
            for(int j = b; j < e; j++){
                if(num[j] == k){
                    count++;
                }
            }
            System.out.println(count);
        }
        //System.out.println(sum);

        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}


