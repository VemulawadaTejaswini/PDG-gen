

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x= 0;
        for(int i = 1; true ; i++){
            x = n * i;
            if(x % 2 == 0){
                break;
            }
           
        }
        System.out.println(x);
    }
    
}
