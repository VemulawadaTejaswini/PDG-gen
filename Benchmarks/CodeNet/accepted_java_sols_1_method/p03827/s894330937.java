import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] moji  = sc.next().toCharArray();
        int max =0;
        int cnt = 0;

        for(int i =0;i<moji.length;i++){
            if(moji[i]=='I'){
                cnt++;
            }else{
                cnt--;
            }
            if(max<cnt){
                max=cnt;
            }
        }
        
        System.out.println(max);

    }
}




