//import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a,b;
        String op;
        boolean isEnd=true;
        Scanner sc;
        //char op;
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            while(isEnd)
            {
                sc = new Scanner(System.in);
                a=sc.nextInt();
                op=sc.next();
                b=sc.nextInt();

            /* line=reader.readLine();
            a=Integer.parseInt(line);

            op=String.parseString(line);

           // line=reader.readLine();
            b=Integer.parseInt(line); */

                switch(op)
                {
                    case "+":
                        System.out.println(a+b);
                        break;
                    case "-":
                        System.out.println(a-b);
                        break;
                    case "*":
                        System.out.println(a*b);
                        break;
                    case "/":
                        System.out.println(a/b);
                        break;
                    case "?":
                        isEnd=false;
                        break;
                    default:
                        break;
                }
            }
            

        }catch(NumberFormatException e){
            System.out.println(e);
        /* }catch(UTILLException e){
            System.out.println(e); */
        }
    }
}
