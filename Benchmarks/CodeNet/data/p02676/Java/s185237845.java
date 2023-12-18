import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int k  = sc.nextInt();
        String s = sc.next();
      	String t = "";
      
      	if (s.length() <= k){ 
            System.out.println(s);
        }else{
          	t = s.substring(0,k);
            System.out.println(t+"...");          
        }
    }
}