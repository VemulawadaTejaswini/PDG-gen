
import java.util.Scanner;
import java.util.ArrayList;
        
public class Main {

    public static void main(String[] args) {
        
        ArrayList<String> task = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < number; i++) {
            String whatTask = scanner.nextLine();
            task.add(whatTask);
        }
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        
        for(int i = 0; i < task.size(); i++) {
            if(task.get(i).equals("AC")) {
                count1++;
            }
            
            if(task.get(i).equals("WA")) {
                count2++;
            }
            
            if(task.get(i).equals("TLE")) {
                count3++;
            }
            
            if(task.get(i).equals("RE")) {
                count4++;
            }
        }
        
        System.out.println("AC x " + count1);
        System.out.println("WA x " + count2);
        System.out.println("TLE x " + count3);
        System.out.println("RE x " + count4);
        
        
        
    }
}