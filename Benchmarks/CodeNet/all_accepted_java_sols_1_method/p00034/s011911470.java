import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] dataset = input.split(",");
            
            int[] sectionLen  = new int[10];
            double totalLen = 0;

            for (int i = 0; i < sectionLen.length; i++) {
                sectionLen[i] = Integer.parseInt(dataset[i]);
                totalLen += (double) sectionLen[i];
            }
            int v1 = Integer.parseInt(dataset[10]);
            int v2 = Integer.parseInt(dataset[11]);
            
            double time = totalLen / (v1 + v2);
            
            double distance = v1 * time;
            int meetSectionIdx = 0;
            
            for (int i = 0; i < sectionLen.length; i++) {
                distance -= sectionLen[i];
                if (distance > 0) {
                    meetSectionIdx = i+1;
                } else {
                    break;
                }
            }
            System.out.println(meetSectionIdx+1);
        }
        
    }   
}