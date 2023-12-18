import java.util.*;
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int k=0;k<n;k++){
                String s = sc.next();
                int[] num = new int[8];
 
                for(int i=0;i<8;i++){
                    num[i] = Integer.valueOf(s.substring(i,i+1));
                }
                Arrays.sort(num);
                int a = 0;
                int b = 0;
                int c = 1;
                for(int i=0;i<8;i++){
                    a += num[i]*c;
                    b += num[7-i]*c;
                    c *= 10;
                }
                System.out.println(a-b);
                 
            }
        }
     
    }   
}