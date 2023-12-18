import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main (String args[]){

        //初期処理
    //    Scanner sc=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();
        String[] sArray=new String[2];
    //    int n=Integer.parseInt(sc.nextLine());
    try{
    int n =Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
    //        sArray = sc.nextLine().split(" ");
    sArray=br.readLine().split("\\s+");
                if ( sArray[0].equals("insert")){
                    set.add(sArray[1]);
                }else{
                    if (set.contains(sArray[1])){
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
        }
    }catch(IOException e){e.printStackTrace();}
}
}

