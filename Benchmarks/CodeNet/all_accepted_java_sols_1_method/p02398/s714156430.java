import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Ans = 0;
        String str[];
        str = new String[3];
        int num[];
        num = new int[3];
        for(int i=0; i<=2; i++)
            {
            str[i] = in.next();
            num[i] = Integer.parseInt(str[i]);
            }
        if (num[0]<=num[1])
            {
            for(int i=num[0]; i<=num[1];i++)
                {
                if(num[2]%i==0){Ans++;}    
                }
            }
        System.out.println(Ans);
    }
    
}