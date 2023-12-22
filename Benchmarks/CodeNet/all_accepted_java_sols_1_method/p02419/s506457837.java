import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cou=0;
        String w = sc.next(),arr;

        while(true){
            arr=sc.next();
            //System.out.print(arr+" ");
            if(arr.equals("END_OF_TEXT")){
                break;
            }
            if(arr.equalsIgnoreCase(w)){
                cou++;
            }
        }
        System.out.println(cou);
        sc.close();
    }
}

