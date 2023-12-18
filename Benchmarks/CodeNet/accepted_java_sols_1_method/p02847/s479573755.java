import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        int nextSunday;
        Scanner scan = new Scanner(System.in);
        String day = scan.next();

            if(day.equals("SUN")) nextSunday = 7;
            else if(day.equals("MON")) nextSunday = 6;
            else if(day.equals("TUE")) nextSunday = 5;
            else if(day.equals("WED")) nextSunday = 4;
            else if(day.equals("THU")) nextSunday = 3;
            else if(day.equals("FRI")) nextSunday = 2;
            else nextSunday = 1;
            
            System.out.println(nextSunday);
    } 
}