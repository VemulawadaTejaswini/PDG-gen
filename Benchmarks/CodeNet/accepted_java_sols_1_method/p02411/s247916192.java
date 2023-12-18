import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
    
        try{
        while((line = reader.readLine()) != null){
            String[] score = line.split(" ");

            if(score[0].equals("-1")&& score[1].equals("-1")){
                break;
            }
            if(score[0].equals("-1")||score[1].equals("-1")){
                System.out.println("F");
                continue;
            }
            
            int sum = Integer.parseInt(score[0]) + Integer.parseInt(score[1]);

            if(sum <30){
                System.out.println("F");
            }
            else if(sum >= 80){
                System.out.println("A");
            }
            else if(sum < 50){
                if(Integer.parseInt(score[2]) >= 50) System.out.println("C");
                else System.out.println("D");
            }
            else if(sum < 65){
                System.out.println("C");
            }
            else System.out.println("B");
        }
        } catch (IOException e){
            System.out.println(e);
        }
        
    }

}
