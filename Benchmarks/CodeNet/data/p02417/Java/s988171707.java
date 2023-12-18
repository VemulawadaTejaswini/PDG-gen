
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            if(!scan.hasNext())break;
            String s = scan.next();
            for(int i = 0;i < s.length();i++){
                alp.countAlp(s.charAt(i));
            }
        }
        for(alp a: alp.values()){
            System.out.println(a.name() + " : " + a.count);
        }

        scan.close();
    }

    enum alp{
        a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

        static void countAlp(char c){
            for(alp a: alp.values()){
                if(a.name().equals(String.valueOf(c).toLowerCase())){
                    a.count++;
                    break;
                }
            }
        }
        int count = 0;
    }

    

}
