import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");

        String ln1 = scanner.nextLine();
        int w = Integer.parseInt(ln1);
        String ln2 = scanner.nextLine();
        int n = Integer.parseInt(ln2);
        int a,b,c;
        int x[] = new int[30];
        for(int i = 0;i < w; i++){
            x[i]= i+1;
        }
        for(int i= 0;i < n;i++){
            String ln3 = scanner.nextLine();
            String ln4[] = ln3.split(",",0);
            a = Integer.parseInt(ln4[0]);
            b = Integer.parseInt(ln4[1]);
            c = x[a-1];
            x[a-1] = x[b-1];
            x[b-1] = c;
        }
        for(int i = 0; i < w; i++){
            System.out.println(x[i]);
        }
        }
    }

