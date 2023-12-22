import java.util.Scanner;
public class Main {
public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str[];
        str = new String[3];
        int num[];
        num = new int[3];
        int num_yobi = 0;
        for(int i=0; i<=2; i++)
            {
            str[i] = in.next();
            num[i] = Integer.parseInt(str[i]);
            }
        for(int j=0; j<=1; j++)
            {
            for(int i=0; i<=1-j; i++)
                {if(num[i] > num[i+1])
                    {
                    num_yobi = num[i];
                    num[i] = num[i+1];
                    num[i+1] = num_yobi;
                    }
                }
            }
        System.out.println(num[0]+" "+num[1]+" "+num[2]);
    }
    
}