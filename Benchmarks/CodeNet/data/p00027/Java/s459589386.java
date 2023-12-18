import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int month = sc.nextInt();
                while(month != 0){
                        int day = sc.nextInt();
                        System.out.println(whatDay(month, day));
                        month = sc.nextInt();
                }
                sc.close();
        }
        static String whatDay(int month, int day){
                int[] daysOfMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
                String[] days = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
                for(int i = 0; i < month-1; i++){
                        day += daysOfMonth[i];
                }
                day += 2;
                return days[day%7];
        }
}