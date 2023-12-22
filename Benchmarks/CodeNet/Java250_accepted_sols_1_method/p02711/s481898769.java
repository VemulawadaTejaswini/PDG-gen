import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int is7 =0;
        
        if(N/100 == 7){
            is7 = 1;
        }
        N=N-(N/100)*100;
        if(N/10 == 7){
            is7 =1;
        }
        N=N-(N/10)*10;
        if(N == 7){
            is7 = 1;
        }

        if(is7 == 1)
            System.out.print("Yes");
        else
            System.out.print("No");
        
    }
}