import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        String strA, strB;
        strA = String.valueOf(a);
        strB = String.valueOf(b);

        String strCon = strA + strB;
//        System.out.println(strCon);

        //数字をつなげた数
        int con = Integer.parseInt(strCon);

        //平方数
        double conSqrt;
        conSqrt = Math.sqrt(con);

        //四捨五入
        conSqrt = Math.round(conSqrt);

        if(conSqrt * conSqrt == con){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}