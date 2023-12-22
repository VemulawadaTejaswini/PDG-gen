import java.io.*;
class Main{
  public static void main(String[] args){
    try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    System.out.println(x*x*x);
    }catch(Exception e){
    }
}}