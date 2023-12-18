import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int A=Integer.parseInt(scan.next());
        int B=Integer.parseInt(scan.next());
        int C=Integer.parseInt(scan.next());
        int D=Integer.parseInt(scan.next());
        int E=Integer.parseInt(scan.next());
        int sum=0;
        if(A<=C){
            sum=(C-A)*60 +D-B -E;
            
        }
        else{
            sum=((C-A)+24) *60+D-B-E ;
        }
        System.out.println(sum);
    }
}
