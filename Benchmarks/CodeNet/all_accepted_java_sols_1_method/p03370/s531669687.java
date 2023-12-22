import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,X,num=0;
        N =sc.nextInt();
        X = sc.nextInt();
        int [] list = new int[N];
        for(int a=0;a<N;a++){
            list[a] = sc.nextInt();
        }
        Arrays.sort(list);
        for(int a=0;a<N;a++){
            X-= list[a];
            num++;
            if(X<0) break;
            }
        for(;;){
            if(X-list[0]>=0) {
                X -= list[0];
                num++;
            }
            else break;
        }
        System.out.println(num);
    }
}