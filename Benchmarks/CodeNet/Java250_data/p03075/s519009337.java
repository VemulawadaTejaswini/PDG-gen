import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();

        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int ad = Math.abs(a-d);
        int ae = Math.abs(a-e);
        int bc = Math.abs(b-c);
        int bd = Math.abs(b-d);
        int be = Math.abs(b-e);
        int cd = Math.abs(c-d);
        int ce = Math.abs(c-e);
        int de = Math.abs(d-e);

        if((ab<=k)&&(ac<=k)&&(ad<=k)&&(ae<=k)&&(bc<=k)&&(bd<=k)&&(be<=k)&&(cd<=k)&&(ce<=k)&&(de<=k)){
            System.out.println("Yay!");
            
        }else{
            System.out.println(":(");
        }
       
    }
}