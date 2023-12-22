import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int re = 0; //結果用
        for(int i = 0; i < 2; i++){
            while(true){
                if(a > b){
                    re = re + a;
                    a--;
                    break;
                }
                if(a < b){
                    re = re + b;
                    b--;
                    break;
                }
                if(a == b){
                    re = re + a;
                    a--;
                    break;
                }
            }
        }
        System.out.println(re);
    }
}