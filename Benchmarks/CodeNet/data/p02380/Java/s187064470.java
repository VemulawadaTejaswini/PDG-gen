import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);

        String line = read.readLine();
        String [] spli = line.split(" ");
        double a = Double.parseDouble(spli[0]);
        double b = Double.parseDouble(spli[1]);
        double angle = Double.parseDouble(spli[2]);
        double area = 0;
        double circum = 0;
        double hight = 0;
        
        if(angle == 90){
        	area = a*b/2;
        	circum = Math.sqrt(a*a+b*b)+a+b;
        	hight = b;
        }
        else if(angle < 90){
        	area = a*b*(Math.sin(angle))/2;
            circum = a+b+(Math.sqrt(a*a+b*b-2*a*b*Math.cos(angle)));
            hight = b*(Math.sin(angle));

        }
        else if(angle > 90 && angle < 180){
        	area = a*b*(Math.sin(180-angle))/2;
            circum = a+b+(Math.sqrt(a*a+b*b-2*a*b*Math.cos(180-angle)));
            hight = b*(Math.sin(180-angle));
        }
        System.out.println(area);
        System.out.println(circum);
        System.out.println(hight); 
        
    }
}