import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char array[] = new char[n];

        for(int i = 0; i<n;i++){
            array[i] = s.charAt(i);
        }

        array[k-1] = Character.toLowerCase(array[k-1]); 
       // System.out.println(array[k-1]);



        for(int i = 0;i<n;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
    }

}
