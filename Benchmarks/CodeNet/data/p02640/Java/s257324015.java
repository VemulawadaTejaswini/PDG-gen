import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for(int i=0; i<=x; i++){
            int j=x-i;
            if(2*i+4*j==y){
                System.out.print("Yes");
              	return;
            }
        }
        System.out.print("No");
    }
}