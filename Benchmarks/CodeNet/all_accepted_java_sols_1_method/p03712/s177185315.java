import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int a=0,b= 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        String[] str = new String[a];
        for (int i=0; i<a; i++){
            str[i] = sc.next();
        }
        
        
            for (int j=0;j<b+2;j++){
                System.out.print("#");
            }
            System.out.println();
            for(int i= 0;i<a;i++){
                System.out.println("#"+ str[i] + "#");
            }
        for (int j=0;j<b+2;j++){
                System.out.print("#");
        }
    }
}
