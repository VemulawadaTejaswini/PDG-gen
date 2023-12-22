import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Ans1, Ans2;
        double Ans3;
        String str[];
        str = new String[2];
        int num[];
        num = new int[2];
        for(int i=0; i<=1; i++)
            {
            str[i] = in.next();
            num[i] = Integer.parseInt(str[i]);
            }
        Ans1 = num[0]/num[1];
        Ans2 = num[0]%num[1];
        
        Ans3 = (double)num[0]/(double)num[1];
        String Ans3after = String.format("%.5f", Ans3);
        System.out.println(Ans1+" "+Ans2+" "+Ans3after);
    }
    
}