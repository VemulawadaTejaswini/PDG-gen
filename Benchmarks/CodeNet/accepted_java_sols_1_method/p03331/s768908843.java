import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 200000;
        
        for(int i=1; i<N/2+1; i++){
            int j = N-i;
            int sum = 0;
            String s1 = String.valueOf(i);
            String s2 = String.valueOf(j);
            for(int k=0; k<s1.length(); k++){
                sum += Character.getNumericValue(s1.charAt(k));
                //System.out.println(s1.charAt(k));
                //System.out.println(sum);
            }
            for(int k=0; k<s2.length(); k++){
                sum += Character.getNumericValue(s2.charAt(k));
                //System.out.println(s2.charAt(k));
                //System.out.println(sum);
            }
            if(sum < min){
                min = sum;
            }
            //System.out.println(sum);
        }
        System.out.println(min);
    }
}