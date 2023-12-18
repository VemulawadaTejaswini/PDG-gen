import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++){
            a[i] = s.nextInt();
        }
        int A = a[0];
        int B = a[2];
        //int miti =  Math.abs(a[0] - a[2]) ;
        for(int i = 0;i<a[4];i++){
            if(A<B){
                A +=a[1];
                B +=a[3];
            }else{
                A -=a[1];
                B -=a[3];
            }
            if(A == B) {
                System.out.println("YES");
                return;
            }
            
        }
        System.out.println("NO");
    }
}
