import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(br.readLine());
        String name;
        int t_point=0;
        int h_point=0;
        while ((name=br.readLine())!=null) {
        	if (card>1000 || name.length()>100) break;
            String[] c_name = name.split(" ");
            String tarou = c_name[0];
            String hanako = c_name[1];
            
            int judge = tarou.compareTo(hanako);
            
            if(judge<0){
                h_point += 3;
            }else if(judge>0){
                t_point += 3;
            }else{
                h_point += 1;
                t_point += 1;
            }
        }
        System.out.println(t_point+" "+h_point);
    }
}