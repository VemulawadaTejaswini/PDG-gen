import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] array = line1.split(" ");
        
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        
        String[] answer = new String[n];
        for(int i = 0; i < n; i++)
        {
            answer[i] = "xx";
        }
        
        
        int right = 0;
        int wrong = 0;
        int waCount[] = new int[n];
        
        for(int i = 0; i < m; i++)
        {
            String buf = sc.nextLine();
            String[] array2 = buf.split(" ");
            
            int problemNo = Integer.parseInt(array2[0]) - 1;
            if(!(answer[problemNo].equals("AC")) && array2[1].equals("AC"))
            {
                right++;
                answer[problemNo] = "AC";
            }
            else if(!(answer[problemNo].equals("AC")) && array2[1].equals("WA"))
            {
                wrong++;
                answer[problemNo] = "WA";
                waCount[problemNo]++;
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            if(answer[i] == "WA")
            {
                wrong -= waCount[i];
            }
        }
        
        System.out.println(right + " " + wrong);
    }
}
