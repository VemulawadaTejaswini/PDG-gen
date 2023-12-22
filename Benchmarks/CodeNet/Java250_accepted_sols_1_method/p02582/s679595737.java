import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String input=s.nextLine();
        List<Character> cl=new ArrayList<>();
        for(int i=0;i<input.length();i++){
            cl.add(input.charAt(i));
        }
        boolean flag=false;

        if(Collections.frequency(cl,'S')==3){
            System.out.println("0");
        }
        else if(Collections.frequency(cl,'R')==3){
           System.out.println("3");
        }
        else {
            for(int i=0;i<input.length()-1;i++){
                if(cl.get(i)=='R' && cl.get(i+1)=='R'){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.println("2");
            }
            else
            {
                System.out.println("1");
            }

        }

    }
}
