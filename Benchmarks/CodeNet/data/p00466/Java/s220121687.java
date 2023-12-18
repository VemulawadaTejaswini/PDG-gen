import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum;
        int other;
        while((sum=sc.nextInt())!=0){
            for(int i=0;i<9;i++){
                other=sc.nextInt();
                sum-=other;
            }
            System.out.println(sum);
        }
    }
}
