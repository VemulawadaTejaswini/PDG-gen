import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int max = 0;

        int i = 2;
        int j = 2;
        int y = (int)Math.pow(i, j);
        
        while(y <= x){
            while(y <= x){
                if(max < y)
                    max = y;
                j++;
                y = (int)Math.pow(i, j);
            }
            i++;
            j = 2;
            y = (int)Math.pow(i, j);
        }

        if(max == 0)
            max = x;
        
        System.out.println(max);
    }
}