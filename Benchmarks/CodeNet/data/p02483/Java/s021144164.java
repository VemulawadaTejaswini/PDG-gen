import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        String ans;
        
        if(a <= b){
            if( b <= c){
                ans = a +" "+ b +" "+ c;
            }else if (a <= c){
                ans = a +" "+ c +" "+b;
            }else{
                ans = c +" "+ a +" "+b;
            }
        }else{
            if(a <= c){
                ans = b+" "+a+" "+c;
            }else{
                if(b<=c){
                    ans = b+" "+c+" "+a;
                }else{
                    ans = c+" "+b+" "+a
                }
            }
        }
        
        System.out.println(ans);
        
    }
}