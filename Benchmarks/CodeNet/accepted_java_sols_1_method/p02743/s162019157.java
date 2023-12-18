import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();
        
        if(C-A-B<0){
            System.out.println("No");
            return;
        }
        
        long LEFT=(A+B-C)*(A+B-C);
        long RIGHT=4*A*B;
        if(LEFT>RIGHT){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}