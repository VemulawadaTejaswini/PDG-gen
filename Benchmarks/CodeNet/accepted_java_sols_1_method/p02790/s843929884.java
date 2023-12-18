
import java.util.*;

class Main {
    static int n,k;
    static String line;
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        Integer a= s.nextInt();
        Integer b=s.nextInt();

            String ret1="";
            for (int i = 0; i <a ; i++) {
                ret1+=b.toString();
            }

            String ret2="";
            for (int i = 0; i <b ; i++) {
                ret2+=a.toString();
            }

            if(ret1.compareTo(ret2)<0){
                System.out.println(ret1);

            }else{
                System.out.println(ret2);
            }



    }
}