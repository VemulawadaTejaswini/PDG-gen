import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            String input = sc.next();
            String[] binput = input.split("");
            int iinput[] = new int[binput.length];
            int sum=0;

            if(input.equals("0")) break;

            int i;
            for(i=0; i<binput.length; i++)
            {
                iinput[i] = Integer.parseInt(binput[i]);
                sum += iinput[i];
            }

            System.out.println(sum);
        }
        sc.close();
    }
}

