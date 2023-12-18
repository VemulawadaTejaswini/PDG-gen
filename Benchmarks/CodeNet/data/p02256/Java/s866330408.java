import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<b){
            c = a; a = b; b = c;
        }
        while(true){
            c = a%b;
            if(c==0){break;}
            a=b;b=c;
        }
        System.out.println(b);
    }
}
