import java.util.*;

/**
 * @Author: Harry
 * @Date: 2019-11-16
 * @Version 1.0
 */
public class Main {

    static int arr[],t,n,arr2[];

//    static int a,b,S;


    static int ans = 0;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(input.hasNext()){
            n = input.nextInt();
            input.nextLine();

            String str = input.nextLine();

            if(n % 2 == 0){
                String t1 = str.substring(0,n / 2);
                String t2 = str.substring(n / 2);

                if(t1.equals(t2)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }



    }

















}