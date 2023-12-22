public class Main {
    public static void main(String[] args)
    {
        int T_num = 0;
        String S = new java.util.Scanner(System.in).nextLine();
        for(int i=0; i<4; i++)
        {
            char testr = S.charAt(i);
            if(testr == '+')
            {
                T_num++;
            }
            else if(testr == '-')
            {
                T_num--;
            }

        }
        System.out.println(T_num);
    }
}
