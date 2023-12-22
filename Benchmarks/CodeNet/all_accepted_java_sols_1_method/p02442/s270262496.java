import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        
        //int x = stdIn.nextInt();
        int a[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        int m = stdIn.nextInt();
        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = stdIn.nextInt();
        }
        
        boolean flag = false;
        
        for(int i = 0; i < Math.min(m, n); i++){
            if(a[i] > b[i]){
                System.out.println(0);
                flag = true;
                break;
            }else if(a[i] < b[i]){
                System.out.println(1);
                flag = true;
                break;
            }
        }
        
        if(!flag){
            if(m > n){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        //System.out.println(sum);

        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}


