import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int l = s.length();
        if(s.charAt(l-1)=='s'){
            String s1 = s.concat("es");
            System.out.println(s1);
        }else {
          String s2 =  s.concat("s");

            System.out.println(s2);

        }
        
    }
}