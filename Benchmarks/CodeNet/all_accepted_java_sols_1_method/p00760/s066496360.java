

import java.util.Scanner;

class Main{
    static final int dayOfNormalYear = 195;
    static final int lastDay = 196471;


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            
            int countYearDivided3 = 0;
            int day = 0;
            for(int i=1;i<y;i++){
                if (i %3 == 0){
                    countYearDivided3 ++;
                }
            }
            day += (dayOfNormalYear*(y-1)) + (countYearDivided3*5);
            if(y % 3 == 0) {
                day += ((m-1) * 20) + d;
            } else {
                day += ((m-1) * 20) - Math.round((m-1)/2) + d;
            }

            System.out.println(lastDay - day);
            n--;
        }
    }
}
