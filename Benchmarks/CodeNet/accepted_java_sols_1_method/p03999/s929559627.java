import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n= s.length();
        long sum = 0;

        for(int i = 0;i < Math.pow(2,n - 1) ;i++){
            String num = String.valueOf(s.charAt(0));
            for(int j=0; j<n-1; j++){
                if((1&i>>j) == 1) { 
                    sum += Integer.parseInt(num);
                    num = "";
                }
                num += String.valueOf(s.charAt(j+1));
            }
            sum += Long.parseLong(num);
        }
        
        System.out.println(sum);
    }
}