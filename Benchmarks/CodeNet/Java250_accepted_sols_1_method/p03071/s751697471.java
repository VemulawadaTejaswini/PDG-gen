import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int re = 0; //結果用
        for(int i = 0; i < 2; i++){
            if(a > b){
                re = re + a;
                a--;
            }else if(a < b){
                re = re + b;
                b--;
        
            }else if(a == b){
                //減らすのはどっちでもいい
                re = re + a;
                a--;

            }
        }
        System.out.println(re);
    }
}