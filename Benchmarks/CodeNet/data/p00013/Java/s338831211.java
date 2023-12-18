import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array = new String[999];
        int i = 0;
         
        while(sc.hasNext()){
            String num = sc.next();
                if(num.equals("0")){
                    i--;
                    System.out.println(array[i]);
                    array[i] = "";
                } else {
                    array[i] = num;
                    i++;
                }
        }
    }
}