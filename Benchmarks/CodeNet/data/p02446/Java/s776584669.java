import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int count = 1;
        //int x = stdIn.nextInt();
        int a[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        a[0] = stdIn.nextInt();
        for(int i = 1; i < n; i++){
            int num = stdIn.nextInt();
            
            if(num != a[count - 1]){
                a[count++] = num;
            }
        }
        
        
        //int q = stdIn.nextInt();
        
        for(int i = 0; i < count - 1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[count - 1]);

        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}



