import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] calc = new String[3];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int x,y;

        while(true){
            calc = in.readLine().split(" ");
            if(calc[1].equals("?")){
                break;
            }
            else{
                x = Integer.parseInt(calc[0]);
                y = Integer.parseInt(calc[2]);

                if     (calc[1].equals("+")){
                    ans.add(x+y);
                }
                else if(calc[1].equals("-")){
                    ans.add(x-y);
                }
                else if(calc[1].equals("*")){
                    ans.add(x*y);
                }
                else if(calc[1].equals("/")){
                    ans.add(x/y);
                }
            }
        }

        for(int a: ans){
            System.out.println(a);
        }
    }
}