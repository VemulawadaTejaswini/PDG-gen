import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] in = new int[w];
        
        for(int i=0;i<w;i++){
            in[i] = i+1;
        }

        for(int i=0;i<n;i++){
            String line = sc.next();
            String[] ab = line.split(",");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;
            int f = in[a];
            in[a] = in[b];
            in[b] = f; 
        }
        for(int i=0;i<w;i++){
            System.out.println(in[i] );
        }            
        sc.close();
    }
}
