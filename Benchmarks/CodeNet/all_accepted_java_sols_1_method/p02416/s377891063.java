import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ArrayList<Integer> Ans = new ArrayList<Integer>();

                    while((str = br.readLine()) != null){
                        String temp[] = str.split("");
                        int sum = 0;
                        for(int i =0;i<temp.length;i++){
                            int num = Integer.parseInt(temp[i]);
                            sum += num;
                        }
                        if(Integer.parseInt(temp[0]) == 0){
                            break;
                        } 
                        Ans.add(sum);
                    }

                    for(int i=0;i<Ans.size();i++){
                        System.out.println(Ans.get(i));
                    }


    }
}