import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int [] v = new int [n];
        int [] c = new int [n];

        for(int i=0; i<n; i++){
            v[i] = stdIn.nextInt();
        }
        for(int i=0; i<n; i++){
            c[i] = stdIn.nextInt();
        }
        int a = 0;

        for(int i=0; i<n; i++){
            if(v[i]>c[i]){
                a += (v[i]-c[i]);
            }
        }

        System.out.println(a);

    }
}
