import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int d,Sum;
   
    public static void main(String[] args) {
        while(read()){
        System.out.println(slove());
        }
    }

    static boolean read(){
    	if(!sc.hasNextInt()) return false;
    	
        d = sc.nextInt();
        return true;
    }
   
    static int func(int a){//f(x)ðvZ·éÖ
        return a * a;//øÌ2æðÔ·
    }
   
    static int slove(){
        if(d == 600){
            System.out.println(216000000);
        }
        int x = d;//¡
        int y = func(d);//c
        Sum = 0;
        for(int i = 1; i*d < 600 ; i++){
            x = i*d;
            y = func(x);
            Sum = Sum + y * d ;
        }
        return Sum;
    }

}