import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String W2 = W.toLowerCase();
        int count = 0;
        while(true)
        {
            String str = sc.next();
            if(str.equals("END_OF_TEXT"))
                break;
            else
            {
                String str2 = str.toLowerCase();
                if(str2.equals(W2))
                    count++;
            }
        }
        System.out.println(count);
    }
}
