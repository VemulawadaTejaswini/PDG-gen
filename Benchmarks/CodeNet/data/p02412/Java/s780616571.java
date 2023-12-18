import java.util.*;
import java.io.*;
 
 
public class Main{
 public static void  main(String[] args)throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();
                     
                    while(str !=null){
                        String[] temp = str.split("\\s");
                        int Enum = Integer.parseInt(temp[0]);
                        int target = Integer.parseInt(temp[1]);
 
                        if(Enum ==0 && target ==0){
                            break;
                        }
                         
                        int count =0;
                        for(int i =1;i<=Enum-2;i++){
                            for(int j=i+1;j<=Enum-1;j++){
                                for(int k=j+1;k<=Enum;k++){
                                    int total = 0;
                                    total = i + j + k;
                                    if(total == target){
                                        count++;
                                    }
                                }
                            }                    
                        }
                        System.out.println(count);
                        str = br.readLine();
 
                    } 
 }
}