import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());

        int count = 1;


        for(int i=1;i<n;){
            i = i * k;

            if(n/i >= 1){
            count++;

            }
        }

        System.out.println(count);

        
        }

}
