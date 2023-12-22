import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;

        for(int i = 0;i < 4;i++){
            char ch = s.charAt(i);
            for(int j = i+1;j < 4;j++){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt == 2?"Yes" : "No");
    }
}