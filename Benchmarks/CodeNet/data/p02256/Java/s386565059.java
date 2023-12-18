import java.util.*;

public class Main {
    public static final int CONSTRAINT = 1000000000;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maxNum = Math.max(x,y);
        int minNum = Math.min(x,y);
        
        GreatestCommonDivisor GCD = new GreatestCommonDivisor();
        System.out.println(GCD.getGCD(maxNum, minNum));
    }
}

class GreatestCommonDivisor{
    // int GCD;    //Greatest Common Divisor 
    public int getGCD(int maxNum, int minNum){
        if(minNum == 0){
            return maxNum;
        }else{
            return getGCD(minNum, (maxNum % minNum));
        }
    }
}
