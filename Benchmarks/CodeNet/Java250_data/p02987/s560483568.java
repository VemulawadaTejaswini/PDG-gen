import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String[] sArray = new String[4];
        int count = 0;
        
        for (int i = 0; i < 4; i++) {
            sArray[i] = s.substring(i, i + 1);
        }
        
        Arrays.sort(sArray);
        if (sArray[0].equals(sArray[1])) {
            count++;
        }
        
        if (sArray[2].equals(sArray[3])) {
            count++;
        }
        
        if (!sArray[0].equals(sArray[3]) ) {
            count++;
        }
        
        if (count == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
} 