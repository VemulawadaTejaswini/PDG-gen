import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner stdIn = new Scanner(System.in);
        boolean[] N = new boolean[101];
        int a=stdIn.nextInt();
        for(int i=0;i<101;i++){
            N[i]=false;
        }
        for(int i=0;i<21;i++){
            for(int j=0;j<15;j++){
                if((i*4+j*7)<101)N[i*4+j*7]=true;
            }
        }
        if(N[a])System.out.println("Yes");
          else System.out.println("No");
    }
}