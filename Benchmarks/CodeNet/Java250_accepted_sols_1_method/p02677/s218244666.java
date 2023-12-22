

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] inputs = br.readLine().split(" ");
            double hour = Double.parseDouble(inputs[0]);
            double minutes = Double.parseDouble(inputs[1]);
            double hour_jiaodu = Math.toRadians(Double.parseDouble(inputs[2])/12*360+30*Double.parseDouble(inputs[3])/60);
            double minute_jiaodu = Math.toRadians(Double.parseDouble(inputs[3])/60*360);
            double chajiao;
            double result;
            if(hour_jiaodu>minute_jiaodu){
                if((hour_jiaodu-minute_jiaodu)<=Math.PI){
                    result = Math.sqrt(hour*hour+minutes*minutes-2*hour*minutes*Math.cos(hour_jiaodu-minute_jiaodu));
                }
                else {
                    result=Math.sqrt(hour*hour+minutes*minutes-2*hour*minutes*Math.cos(2*Math.PI-(hour_jiaodu-minute_jiaodu)));
                }
            }
            else {
                if(minute_jiaodu-hour_jiaodu<=Math.PI){
                    result=Math.sqrt(hour*hour+minutes*minutes-2*hour*minutes*Math.cos(minute_jiaodu-hour_jiaodu));;
                }
                else {
                    result=Math.sqrt(hour*hour+minutes*minutes-2*hour*minutes*Math.cos(2*Math.PI-(minute_jiaodu-hour_jiaodu)));
                }
            }
            System.out.print(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
