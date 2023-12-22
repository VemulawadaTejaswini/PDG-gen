import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        int x=-1, k=-1;
        Scanner input = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            x=input.nextInt();
            if(x==0){
                k=i;
            }
        }
        System.out.print(k);
    }
}