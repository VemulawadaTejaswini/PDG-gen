
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        while(true){
            String s=scanner.next();
            String[] strings=s.split("");
            if(strings[0].equals("0")){
                return;
            }
            long result=0;
            for(int i=0;i<strings.length;i++){
                int c=Integer.parseInt(strings[i]);
                result+=c;
            }
            System.out.println(result);

        }
    }

}

