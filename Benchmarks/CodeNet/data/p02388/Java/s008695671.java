import java.io.*;

public class main{

    public static void main(String args[]){
        BufferdReader bufferdReader = new BufferdReader(new InputStreamReader(System.in));
        String inputNum = bufferdReader.readLine();
        System.out.println(inputNum * inputNum * inputNum);
    }
}