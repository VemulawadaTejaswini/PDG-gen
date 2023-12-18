


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String results = sc.next();

        int count = 0;
        for(char x : results.toCharArray()){
            if(x == 'x'){
                count++;
            }
        }

        if(count < 8){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
