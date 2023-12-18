import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int N = 0;
        int[] a_i;
        int mas=0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        //if(!(1<=N))System.out.println("Nを1以上の数にしてね");
        a_i = new int[N];
        for(int i = 0;i<N;i++){
            a_i[i] = scan.nextInt();
        }
        for(int i = 0;i<N;i++){
            //if(!(a_i[i] <= 100))System.out.println("a_" + i + "を100いかにしてね");
           if(!((i+2)%2==0)){
               if(!((a_i[i]+2)%2==0))mas++;
           }
        }
        System.out.println(mas);
    }
}