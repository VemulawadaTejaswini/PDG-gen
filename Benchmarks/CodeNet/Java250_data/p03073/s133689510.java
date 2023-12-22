import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int countA = 0,countB = 0;
        for(int i = 0;i<s.length;i++){
            if(i%2==0){
                if(s[i]=='1'){
                    countA ++;
                }
                if(s[i]=='0'){
                    countB++;
                }
            }
            if(i%2!=0){
                if(s[i]=='0'){
                    countA ++;
                }
                if(s[i]=='1'){
                    countB ++;
                }
            }
        }
        System.out.println(Math.min(countA,countB));
    }
}
