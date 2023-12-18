import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int i=0;
            int w=sc.nextInt();
            int n=sc.nextInt();
            int[] values = new int[w];
            for(i=0;i<w;i++){
                values[i]=i+1;
            }
            for(i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c=values[a-1];
                values[a-1]=values[b-1];
                values[b-1]=c;
            }
            for(i=0;i<w;i++){
                System.out.println(values[i]);
            }
        }
    }
}
