import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10000;i++){
            int x=sc.nextInt();
            if(x==0){
                break;
            }
            System.out.printf("Case %d: %d\n",i,x);
            
        }
    }
}

