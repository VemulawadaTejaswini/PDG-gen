import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                sc.close();
        //int N = Integer.parseInt(str);

                int count=0;

        for(int i = 0; i < str.length(); i++){
            count += str.charAt(i) - '0';
        }


                System.out.println((count%9 == 0) ? "Yes" : "No");
        }
}

