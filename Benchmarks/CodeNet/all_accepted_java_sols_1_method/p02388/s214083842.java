import java.util.*;

class Main{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i<1 || 100<i){
            System.exit(-1);
        }
            System.out.println(i*i*i);
    }
}