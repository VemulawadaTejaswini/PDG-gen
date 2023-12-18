import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, Sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for (int i= 0; i< b-a+1; i++){
                if(c%(a+i)==0){
                    Sum ++;
                }
        }
        System.out.println(Sum); 
    }
}
