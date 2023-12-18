
import java.util.*;

class Main {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        Integer n= s.nextInt();
        int count=0;
        Map<Integer,Integer> a=new HashMap<>();
        for (int i = 0; i <100 ; i++) {
            a.put(i,0);
        }
        for (int i = 1; i <=n ; i++) {
            //さいしょのもじ
            int ns=String.valueOf(i).charAt(0)-'0';
            int nf=i%10;
            int and=nf+ns*10;

            // jibun
            if(ns==nf){count++;}
            // gyaku
            int bnd=nf*10+ns;
            count+=a.get(bnd)*2;
            a.put(and,a.get(and)+1);

        }
        System.out.println(count);
    }

}