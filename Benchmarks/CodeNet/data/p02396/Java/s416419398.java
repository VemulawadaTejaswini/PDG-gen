import java.util.Scanner;
  
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int s;
        int[] x = new int[10000];
        int i = 0;
        do{
            s = stdIn.nextInt();
            x[i] = s;
        }while(s!=0);
  
        for(i = 0; x[i] == 0; i++)
            System.out.println("Case " +(i+1)+ ": " +x[i]);
    }
}