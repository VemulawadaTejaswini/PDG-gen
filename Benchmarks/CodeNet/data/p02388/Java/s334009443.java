import java.io.*;
public class Main{
    public static void main(String[] args){
        System.out.println("??´??°?????\???");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.i\
n));
        try{
        String line=reader.readLine();
        int x=Integer.parseInt(line);

        System.out.println((x*x*x));
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("??´??°??§?????????");
        }
    }
}