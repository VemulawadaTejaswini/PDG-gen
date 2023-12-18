

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            ArrayList<Double> hi = new ArrayList<Double>();
            while((line=br.readLine())!=null){  //if(line.equals(""))break;
                hi.add(Double.parseDouble(line));
            }
            double min=Double.MAX_VALUE,max=-1;
            for(double d : hi){
                if(d<min) min=d;
                if(d>max)max=d;
            }
            System.out.println(max-min);
        }catch(Exception e){e.printStackTrace();}        
    }
    
}