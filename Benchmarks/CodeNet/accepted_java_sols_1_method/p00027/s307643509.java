import java.util.*;
import java.util.Date;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> day = new ArrayList<String>();
        String line;
        Calendar cal = Calendar.getInstance();
        int y = 2004;
        while(true) {
            line = sc.nextLine();
            String[] A = line.split(" ");
            int m = Integer.parseInt(A[0]);
            int d = Integer.parseInt(A[1]);
            if(m == 0 && d == 0) { 
                break;
            }
            cal.set(y, m-1, d);
            int num = cal.get(Calendar.DAY_OF_WEEK);
            switch(num) {
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                    
            }
        }
    }
}
