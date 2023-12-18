import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans ="yes";
        char[] test = s.toCharArray();
        outLoop:for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j&&test[i]==test[j]){
                    ans = "no";
                    break outLoop;
                }
            }
        }
        System.out.println(ans);
    }
}