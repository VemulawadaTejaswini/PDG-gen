import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] c = str.toCharArray(); 

        int n = str.length();

        for(int i=0;i<n;i++){
            if(65 <= c[i] && c[i] <= 90){
                c[i] += 32;
            }

            else if(97 <= c[i] && c[i] <= 122){
                c[i] -= 32;
            }

            else{

            }

            System.out.printf("%c",c[i]);

        }

        System.out.println();

        sc.close();

    }



}
