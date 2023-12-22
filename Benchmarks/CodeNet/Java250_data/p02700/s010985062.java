import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String ans = "No";
        outloop:for(;;){
            c = c-b;
            if(c<=0){
                ans = "Yes";
                break outloop;
            }
            a = a-d;
            if(a<=0){
                break outloop;
            }
        }
        System.out.println(ans);
        }
    }
