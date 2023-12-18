import java.util.*;
public class Main {
    public static void main(String[] args){

        long NUM=2019;
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int L=sc.nextInt();
        int R=(sc.nextInt()-L);
        if(R>=2019){
            System.out.println(0);
            return;

        }
        L=L%2019;
        R=R+L+1;
        int result=2019*2019;
        for(int i=L;i<R;i++){
            for(int j=i+1;j<R;j++){
                int a=(i*j)%2019;
                if(a<result){
                    result=a;
                }
            }
        }

        System.out.println(result);


    }
}
