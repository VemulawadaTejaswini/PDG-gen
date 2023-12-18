import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;
        String result="";
        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        String array[] = new String[x];
        for(int i=0;i<x;i++){
           array[i]=inpunt.nextLine();
        }

        Arrays.sort(array);

        for(int i=0;i<x;i++){
            result += array[i];
        }
        System.out.println(result);

    }
}