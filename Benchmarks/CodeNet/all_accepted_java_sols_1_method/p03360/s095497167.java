import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=0,K,n=0;
        int [] num = new int[3];
        for(int a=0;a<3;a++){
            num[a] = sc.nextInt();
            if(num[a]>max) {
                max =num[a];
                n=a;
            }
        }
        K=sc.nextInt();
        for(int b=0;b<K;b++){
            num[n] *=2;
        }
        int sum=0;
        for(int a=0;a<3;a++) {
            sum += num[a];
        }
        System.out.println(sum);

    }
}
