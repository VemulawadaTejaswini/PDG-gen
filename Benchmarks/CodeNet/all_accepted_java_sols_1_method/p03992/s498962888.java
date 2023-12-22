import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        char[] c = s.toCharArray();
        String s2="";
        for(int i=0;i<4;i++) {
            s2+=c[i];
        }
        s2+=" ";
        for(int i=4;i<c.length;i++){
        	s2+=c[i];
        }
        //String s = String.valueOf(i);
        //int i = Integer.parseInt(s);
        System.out.println(s2);

    }
}

