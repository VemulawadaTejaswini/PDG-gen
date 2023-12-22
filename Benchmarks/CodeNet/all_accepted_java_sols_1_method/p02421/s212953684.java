import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro = 0;
        int hanako = 0;
        for(int i = 0 ; i < n ; i++)
        {
            String Taro = sc.next();
            String Hanako = sc.next();
            int x = Taro.compareTo(Hanako);
            if(x > 0)
                taro += 3;
            else if(x == 0)
            {
                taro++;
                hanako++;
            }
            else
                hanako += 3;
        }
        System.out.println(taro + " " + hanako);
    }
}
