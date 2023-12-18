
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split("");

        int count=0;

        for(int i=0; i<3; i++){
            if(stringArray[i].equals("7")){
                count++;
            }
        }
        if(count != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }


}