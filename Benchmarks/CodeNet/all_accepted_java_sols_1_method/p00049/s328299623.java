import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{

    public static void main(String args[])throws IOException
    {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    String blood;
    int human[]=new int[4];
    while((blood = input.readLine()) != null) {

        String a[]=blood.split(",");

        if(a[1].equals("A")){
        	human[0]++;
        }
        if(a[1].equals("B")){
        	human[1]++;
        }
        if(a[1].equals("AB")){
        	human[2]++;
        }
        if(a[1].equals("O")){
        	human[3]++;
        }

        }
    for(int i=0;i<4;i++)
        {
        System.out.println(human[i]);
        }
    }
}