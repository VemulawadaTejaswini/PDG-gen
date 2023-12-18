import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,X,Y,sum_price=0;
        ArrayList<Integer> price = new ArrayList<>();
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        X=sc.nextInt();
        Y=sc.nextInt();
        int L;
        if(X>Y)L=X;
        else L=Y;
        for(int a=0;a<=L;a++){
            sum_price =0;
            sum_price += C*2*a;
            for(int b=0;b<X-a;b++){
                sum_price += A;
            }
            for(int c=0;c<Y-a;c++){
                sum_price +=B;
            }
            price.add(sum_price);
        }
        System.out.println(Collections.min(price));
    }
}