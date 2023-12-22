import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] moji = sc.next().toCharArray();
        boolean flag = true;
        Arrays.sort(moji);
        int cnt = 0;
        for(int i = 0;i<moji.length-1;i++){
            if(moji[i]==moji[i+1]){
                cnt++;
            }else{
                if(cnt%2!=1){
                    flag = false;
                    break;
                }
                cnt=0;
            }
        }

        if(flag&&moji.length!=1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




    }
}




