import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next(),b= sc.next();
        int c = Integer.parseInt(a+b);
        String ans = "No";
        for(int i = 1;i*i<=c;i++){
            if(i*i==c){
                ans = "Yes";
            } else {
                ans = "No";
            }
        }
        System.out.println(ans);
    }
}