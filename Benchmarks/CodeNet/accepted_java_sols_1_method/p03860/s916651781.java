import java.io.*;
public class Main
{
  public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        try
        {
            String line = reader.readLine();
            String[] data = line.split(" ");
            char[] answer =new char[3];
            for(int i=0; i<3; i++)
            {
                answer[i]=data[i].charAt(0);
                System.out.print(answer[i]);
            }
            System.out.print("\n");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}