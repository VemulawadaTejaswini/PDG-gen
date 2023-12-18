import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
      
        int count = 0;
        char[] c = S.toCharArray();
        for(char c1 : c) {
            count++;
            if (count!= K){
            System.out.print(c1);
            }else{
            String tmp = String.valueOf(c1);
            System.out.print(tmp.toLowerCase());
            
            }
          
        }
        
        
    System.out.println();
    }
}

