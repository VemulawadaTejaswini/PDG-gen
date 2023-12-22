    import java.util.Scanner;
     
     
    public class Main {
        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n =s.length();
            String a=s.substring(0,(n-1)/2);
            String b=s.substring(((n+3)/2)-1,n);
             if (a.equals(b)){
                System.out.println("Yes");
             }else{
                System.out.println("No");
             }
           } 
        }
    
