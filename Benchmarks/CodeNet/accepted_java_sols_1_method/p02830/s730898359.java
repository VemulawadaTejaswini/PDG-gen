import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        StringBuffer bf = new StringBuffer();
        //ここまで入力

        for(int i=0; i<A.length(); i++){
            bf.append(A.charAt(i));
            bf.append(B.charAt(i));
        }

        System.out.println(bf);
    }
}