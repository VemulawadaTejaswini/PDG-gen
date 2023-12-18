import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int sn = s.length();
        int tn = t.length();
        int max = 0;
        int count = 0;
        for(int i = 0; i < sn; i++){
            for(int j = 0; j < tn; j++){
                if(s.charAt(i) == t.charAt(j)){
                    count++;
                }else{
                    count = 0;
                }
                if(j <= i){
                    max = Math.max(max, count);
                }
            }
        }
        System.out.println(tn-max);
    }
}