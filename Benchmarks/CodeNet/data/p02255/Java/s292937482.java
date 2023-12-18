import java.util.Scanner;
public class Main{
    public static void print(int num[]){
        for(int i = 0 ; i < num.length-1 ; i++)
            System.out.print(num[i] + " ");
        System.out.println(num[num.length-1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            num[i] = sc.nextInt();
        print(num);
        for(int i = 1 ; i < n ; i++)
        {
            int j = i-1;
            int tmp = num[i];
            while(j >= 0)
            {
                if(num[j] > tmp)
                {
                    num[j+1] = num[j--];
                    num[j+1] = tmp;
                }
                else
                {
                    num[j+1] = tmp;
                    break;
                }
            }
            print(num);
        }
    }
}
