import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
    	   	                                                 
    	int n = Integer.parseInt(read.readLine());
        int taroP = 0;
        int hanaP = 0;

        for(int N = 0; N < n; N++){
           // String taro = read.readLine();
           // String hana = read.readLine();
        	
        	String line = read.readLine();
        	String [] tarohana = line.split(" ");

                if(tarohana[0].compareTo(tarohana[1]) > 0){
                taroP = taroP + 3;
                }
                else if(tarohana[0].compareTo(tarohana[1]) < 0){
                hanaP = hanaP + 3;
                }
                else if(tarohana[0].compareTo(tarohana[1]) == 0){
                 taroP = taroP + 1;
                 hanaP = hanaP + 1;
                }
        }
        System.out.println(taroP+" "+hanaP);
    }
}