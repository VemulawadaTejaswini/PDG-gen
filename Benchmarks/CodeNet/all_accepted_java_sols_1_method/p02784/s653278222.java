import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int hitPoint = sc.nextInt();
        int skillNum = sc.nextInt();
        int[] powers = new int[skillNum];
        int totalDamage = 0;
        
        for (int i = 0; i < skillNum; i++) {
            powers[i] = sc.nextInt();
            totalDamage += powers[i];
        }     
        
        if (totalDamage >= hitPoint) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
        