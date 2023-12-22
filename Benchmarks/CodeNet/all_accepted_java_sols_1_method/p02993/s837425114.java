import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String[] array = new String[4];
        
        for (int i = 0; i < 4; i++) {
            array[i] = s.substring(i, i + 1);
        }
        
        //Arrays.sort(array);
        int count = 0;
        
        for (int i = 0; i < 3; i++) {
            if (array[i].equals(array[i + 1])) {
                count++;
            }
        }
        
        if (count != 0) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
        
    }
}