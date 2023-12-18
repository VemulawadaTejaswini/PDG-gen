import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(
            new InputStreamReader(System.in));
            StringBuilder str =new StringBuilder();
            while(true){
            String data =br.readLine();
            String array[]=data.split(" ",-1);
            ArrayList<Integer> number=new ArrayList<Integer>();
            number.add(Integer.parseInt(array[0]));
            number.add(Integer.parseInt(array[1]));
            if(number.get(0)>=number.get(1))
            {System.out.println(number.get(1)+" "+number.get(0));}
            else
            {System.out.println(number.get(0)+" "+number.get(1));}
        }
    }
}