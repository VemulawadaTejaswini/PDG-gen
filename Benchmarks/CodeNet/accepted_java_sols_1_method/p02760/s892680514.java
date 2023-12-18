import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] a1 = input.readLine().split(" ");
        String[] a2 = input.readLine().split(" ");
        String[] a3 = input.readLine().split(" ");
        boolean flag = false;

        int n = Integer.parseInt(input.readLine());

        String[] b = new String[n];
        for(int i=0; i < n; i++){
            b[i] = input.readLine();
            for(int j=0; j<3;j++){
                if(a1[j].equals(b[i])){
                    a1[j] = "0";                    
                }
                if(a2[j].equals(b[i])){
                    a2[j] = "0";
                }
                if(a3[j].equals(b[i])){
                    a3[j] = "0";
                }
            }
        }
        if(a1[0].equals("0") && a1[1].equals("0") && a1[2].equals("0")){
            flag = true;
        }
        if(a2[0].equals("0") && a2[1].equals("0") && a2[2].equals("0")){
            flag = true;
        }
        if(a3[0].equals("0") && a3[1].equals("0") && a3[2].equals("0")){
            flag = true;
        }
        if(a1[0].equals("0") && a2[0].equals("0") && a3[0].equals("0")){
            flag = true;
        }
        if(a1[1].equals("0") && a2[1].equals("0") && a3[1].equals("0")){
            flag = true;
        }
        if(a1[2].equals("0") && a2[2].equals("0") && a3[2].equals("0")){
            flag = true;
        }
        if(a1[0].equals("0") && a2[1].equals("0") && a3[2].equals("0")){
            flag = true;
        }
        if(a1[2].equals("0") && a2[1].equals("0") && a3[0].equals("0")){
            flag = true;
        }

        if(flag==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

