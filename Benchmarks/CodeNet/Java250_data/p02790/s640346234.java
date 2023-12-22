import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] sa = new int[b];
        for ( int i = 0;  i < b;  i++ ){
            sa[i] = a;
        }

        int[] sb = new int[a];
        for ( int i = 0;  i < a;  i++ ){
            sb[i] = b;
        }

        if(sa.length>sb.length){
            for(int in = 0; in<sa.length; in++){
            System.out.print(sa[in]);
            }
        } else {
            for(int in = 0; in<sb.length; in++){
                System.out.print(sb[in]);
                }
            
        }

        sc.close();



    }
}
