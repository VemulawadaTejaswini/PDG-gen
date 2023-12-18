import java.io.*;
import java.util.*;

class Main{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            br.lines()
                .forEach(System.out::println);
        }catch(Exception e){

        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}