import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        char[] S=sc.next().toCharArray();
        int result=0;
        int tmp=0;

        for(int i=0;i<S.length;i++){
            if(S[i]=='R'){
                tmp++;
            }else{
                if(tmp>result){
                    result=tmp;
                    tmp=0;

                }
            }
        }
        if(tmp>result){
            result=tmp;
        }
        System.out.println(result);

    }
}