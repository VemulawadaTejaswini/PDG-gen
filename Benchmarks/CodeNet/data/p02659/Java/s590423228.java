import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        long    a = sc.nextLong();      // A
        double  b = sc.nextDouble();    // B:小数点以下は二桁
        // 精度を補うため，long型で計算を行う
        a = a * (long)(b*100) /100;   // (A x (Bx100)) / 100
        System.out.println(a);    // output
    }
}