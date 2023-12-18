import java.util.Scanner;
public class Main{
    public static void roll(String order, int we[], int ns[]){
        for(int i = 0 ; i < order.length() ; i++)
        {
            switch(order.charAt(i))
            {
                case 'E' : int tmp = we[3]; we[3] = we[2]; we[2] = we[1]; we[1] = we[0]; we[0] = tmp; ns[1] = we[2]; ns[3] = we[0]; break;
                case 'W' :     tmp = we[0]; we[0] = we[1]; we[1] = we[2]; we[2] = we[3]; we[3] = tmp; ns[1] = we[2]; ns[3] = we[0]; break;
                case 'N' :     tmp = ns[0]; ns[0] = ns[1]; ns[1] = ns[2]; ns[2] = ns[3]; ns[3] = tmp; we[2] = ns[1]; we[0] = ns[3]; break;
                case 'S' :     tmp = ns[3]; ns[3] = ns[2]; ns[2] = ns[1]; ns[1] = ns[0]; ns[0] = tmp; we[2] = ns[1]; we[0] = ns[3]; break;
            }
        }
        System.out.println(we[2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int we[] = new int[4];
        int ns[] = new int[4];
        int num[] = new int[6];
        for(int i = 0 ; i < 6 ; i++)
            num[i] = sc.nextInt();
        we[0] = ns[3] = num[5];
        we[1] = num[3];
        we[2] = ns[1] = num[0];
        we[3] = num[2];
        ns[2] = num[1];
        ns[0] = num[4];
        String order = sc.next();
        roll(order,we,ns);
    }
}
