import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            String abcd = sc.next();

            int a = Integer.parseInt(abcd.substring(0, 1));
            int b = Integer.parseInt(abcd.substring(1, 2));
            int c = Integer.parseInt(abcd.substring(2, 3));
            int d = Integer.parseInt(abcd.substring(3, 4));

            StringBuilder sb = new StringBuilder();

            if(isSeven(a, b, c, d)){
                sb.append(a);
                sb.append("+").append(b);
                sb.append("+").append(c);
                sb.append("+").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, c, -d)){
                sb.append(a);
                sb.append("+").append(b);
                sb.append("+").append(c);
                sb.append("-").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, -c, d)){
                sb.append(a);
                sb.append("+").append(b);
                sb.append("-").append(c);
                sb.append("+").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, c, d)){
                sb.append(a);
                sb.append("-").append(b);
                sb.append("+").append(c);
                sb.append("+").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, c, -d)){
                sb.append(a);
                sb.append("-").append(b);
                sb.append("+").append(c);
                sb.append("-").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, -c, d)){
                sb.append(a);
                sb.append("-").append(b);
                sb.append("-").append(c);
                sb.append("+").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, -c, -d)){
                sb.append(a);
                sb.append("+").append(b);
                sb.append("-").append(c);
                sb.append("-").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, -c, -d)){
                sb.append(a);
                sb.append("-").append(b);
                sb.append("-").append(c);
                sb.append("-").append(d);
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            }
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }

    private static boolean isSeven(int a, int b, int c, int d){
        if(a+b+c+d == 7) return true;
        else return false;
    }
}
