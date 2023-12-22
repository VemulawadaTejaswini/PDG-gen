import java.util.Scanner;
class Main
{
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scan.nextInt();
        int sum=0;
        int numCopy = num;

        while(num>0)
        {
            int n = num % 10;
            sum += n;
            num /= 10;
        }

        if(numCopy % sum == 0)
        {
            System.out.println("Yes");
        }else{
            
            System.out.println("No");
        }
    }
}