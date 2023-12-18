import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int[] L=new int[N];
        for(int i=0;i<N;i++){
            L[i]=sc.nextInt();
        }
        int result=0;
        for(int a=0;a<N;a++){
            for(int b=a+1;b<N;b++){
                for(int c=b+1;c<N;c++){
                    if(L[a]!=L[b]&&L[b]!=L[c]&&L[c]!=L[a]){

                    if(L[a]+L[b]>L[c]&&L[b]+L[c]>L[a]&&L[c]+L[a]>L[b]){
                        result++;
                    }
                    }

                }
            }
        }

        System.out.println(result);

    }
}