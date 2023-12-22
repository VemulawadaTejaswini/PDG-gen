import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int b = s.length();
        for(int j=0;j<b;j++){
            if(s.charAt(j) != s.charAt(b-1-j)){
                i++;
            }
        }
        System.out.println(i / 2);
    } 
}