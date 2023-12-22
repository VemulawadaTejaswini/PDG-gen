import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        String str = sc.next();
        String str2[] = str.split("");
        for(int i=0;i<num-1;i++)
        {
            if(!(str2[i].equals(str2[i+1])))
            {
                sum++;
            }
        }
        System.out.println(sum+1);
    }
}